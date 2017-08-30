package arthur.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Answer;
import arthur.entity.Journal;
import arthur.entity.Question;
import arthur.entity.StuClass;
import arthur.entity.Student;
import arthur.entity.Teacher;
import arthur.service.AnswerService;
import arthur.service.JournalService;
import arthur.service.QuestionService;
import arthur.service.StuClassService;
import arthur.service.UserService;

/**
 * 
 * @auther 代益铨 2017年8月19日下午3:17:41
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	UserService userService;
	@Resource
	StuClassService stuClassService;
	@Resource
	QuestionService questionService;
	@Resource
	AnswerService answerService;
	@Resource
	JournalService journalService;

	// 登录页面
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	// 登录验证
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("name") String name, @RequestParam("pwd") String pwd, HttpSession session,
			Model model) {
		if (name.equals(null) || name == "") {
			return "login";
		}
		Student s = userService.sLogin(name);
		Teacher t = userService.tLogin(name);
		if (s != null) {
			if (s.getStudentPwd().equals(pwd)) {
				session.setAttribute("student", s);
				this.findAllQuestion(model);
				int id = ((Student) session.getAttribute("student")).getId();
				this.find(model, id);
				this.selectJournal(session, model);
				return "home";
			}
			if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				this.findAllQuestion(model);
				return "teacherattendance";
			}
		} else if (t != null) {
			s = userService.sLogin(name);
			if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				this.findAllQuestion(model);
				return "teacherattendance";
			}
			if (s.getStudentPwd().equals(pwd)) {
				session.setAttribute("student", s);
				this.findAllQuestion(model);
				int id = ((Student) session.getAttribute("student")).getId();
				this.find(model, id);
				this.selectJournal(session, model);
				return "home";
			}
		}
		return "login";
	}

	// 跳转到学生个人信息页面
	@RequestMapping(value = "/personal", method = RequestMethod.GET)
	public String personal(Model model, HttpSession session) {
		int studentId = ((Student) session.getAttribute("student")).getId();
		Student stu = userService.findByStudentId(studentId);
		model.addAttribute("stu", stu);
		return "student";
	}

	// 修改密码
	@RequestMapping(value = "/updatePwd", method = RequestMethod.GET)
	public String updatePwd() {
		return "updatePwd";
	}

	// 修改密码
	@RequestMapping(value = "/updatePwd", method = RequestMethod.POST)
	public String updatePwd(@RequestParam("studentPwd") String studentPwd, @RequestParam("stuPwd1") String stuPwd1,
			@RequestParam("stuPwd2") String stuPwd2, HttpSession session) {
		String i = "updatePwd";
		if (studentPwd == null || "" == studentPwd) {
			return i;
		}
		if (stuPwd1 == null || stuPwd1 == "") {
			return i;
		}
		if (stuPwd2.equals(stuPwd1)) {
			int id = ((Student) session.getAttribute("student")).getId();
			int j = userService.updatePwd(id, stuPwd1);
			if (j > 0) {
				i = "login";
				return i;
			}
		}
		return i;
	}

	// 学生点击返回首页跳到学生首页
	@RequestMapping(value = "/stuHomePage", method = RequestMethod.GET)
	public String stuHomePage(Model model, HttpSession session) {
		this.findAllQuestion(model);
		int id = ((Student) session.getAttribute("student")).getId();
		this.find(model, id);
		this.selectJournal(session, model);
		return "home";
	}

	// 老师点击返回首页跳到老师首页
	@RequestMapping(value = "/tHomePage", method = RequestMethod.GET)
	public String tHomePage(Model model) {
		this.findAllQuestion(model);
		return "teacherattendance";
	}

	// 老师给学生注册
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		this.findAll(model);
		return "register";
	}

	// 老师给学生注册
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Student student, Model model) {
		if (student != null || !"".equals(student)) {
			int i = userService.addStudent(student);
			if (i > 0) {
				model.addAttribute("register", "注册成功!");
				return "register";
			}
		}
		return "register";
	}

	// 查询所有班级
	public void findAll(Model model) {
		List<StuClass> stuClass = stuClassService.fingAll();
		model.addAttribute("stuClass", stuClass);
	}

	// 查询所有提问信息
	public void findAllQuestion(Model model) {
		List<Question> question = questionService.findAll();
		model.addAttribute("questiona", question);
	}

	// 查看自己提问和回答者的信息
	public void find(Model model, Integer id) {
		List<Question> qu = questionService.findAllMy(id);
		model.addAttribute("qus", qu);
	}

	// 考到提问发表答案
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addAdswer(Answer answer, Model model, HttpSession session) {
		answer.setAnswerId(((Student) session.getAttribute("student")).getId());
		answer.setAnswerTime(new Timestamp(System.currentTimeMillis()));
		answerService.addAnswer(answer);
		answer.setStudentId(answer.getQuestionId());
		answerService.addQuestion(answer);
		this.findAllQuestion(model);
		int id = ((Student) session.getAttribute("student")).getId();
		this.find(model, id);
		return "home";
	}

	// 日志填写
	@RequestMapping(value = "/jorunal", method = RequestMethod.POST)
	public String addJournal(@RequestParam("test") String test, HttpSession session, Model model) {
		Journal jour = new Journal();
		jour.setJournalContent(test);
		jour.setJournalTime(new Timestamp(System.currentTimeMillis()));
		jour.setStuClass(((Student) session.getAttribute("student")).getClassId());
		jour.setStudentId(((Student) session.getAttribute("student")).getId());
		journalService.addJournal(jour);
		model.addAttribute("journal", "填写日志成功！");
		return "student";
	}

	// 查询自己的日志并在首页显示
	public void selectJournal(HttpSession session, Model model) {
		int studentId = ((Student) session.getAttribute("student")).getId();
		List<Journal> jour = journalService.findAll(studentId);
		model.addAttribute("journal", jour);
	}
}
