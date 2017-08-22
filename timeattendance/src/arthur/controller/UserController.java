package arthur.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.StuClass;
import arthur.entity.Student;
import arthur.entity.Teacher;
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

	// 登录页面
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	// 登录验证
	@RequestMapping(value = "login", method = RequestMethod.POST)
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
				return "home";
			}
			if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				return "teacherattendance";
			}
		} else if (t != null) {
			s = userService.sLogin(name);
			if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				return "teacherattendance";
			}
			if (s.getStudentPwd().equals(pwd)) {
				session.setAttribute("student", s);
				return "home";
			}
		}
		return "login";
	}

	// 跳转到学生个人信息页面
	@RequestMapping(value = "personal", method = RequestMethod.GET)
	public String personal() {
		return "student";
	}

	// 修改密码
	@RequestMapping(value = "updatePwd", method = RequestMethod.GET)
	public String updatePwd() {
		return "updatePwd";
	}

	// 修改密码
	@RequestMapping(value = "updatePwd", method = RequestMethod.POST)
	public String updatePwd(@RequestParam("studentPwd") String studentPwd, @RequestParam("stuPwd1") String stuPwd1,
			@RequestParam("stuPwd2") String stuPwd2, Model model, HttpSession session) {
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

	// 返回学生首页
	@RequestMapping(value = "stuHomePage", method = RequestMethod.GET)
	public String stuHomePage() {
		return "home";
	}

	// 返回老师首页
	@RequestMapping(value = "tHomePage", method = RequestMethod.GET)
	public String tHomePage() {
		return "teacherattendance";
	}

	// 老师给学生注册
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Model model) {
		this.fingAll(model);
		return "register";
	}

	// 老师给学生注册
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(Student student, Model model) {
		if (student != null || !"".equals(student)) {
			int i = userService.addStudent(student);
			if (i > 0) {
				return "teacherattendance";
			}
		}
		return "register";
	}

	// 查询所有班级
	public void fingAll(Model model) {
		List<StuClass> stuClass = stuClassService.fingAll();
		model.addAttribute("stuClass", stuClass);
	}
}
