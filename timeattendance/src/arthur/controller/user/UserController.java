package arthur.controller.user;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Question;
import arthur.entity.Student;
import arthur.service.AnswerService;
import arthur.service.UserService;
import utils.PageSupport;

/***
 * 
 * @author 谭夏男
 *
 */

@Controller
@RequestMapping("/arthur/user")
public class UserController {
	@Resource
	UserService userService;
	@Resource
	AnswerService answerService;

	/**
	 * 
	 * 登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	/**
	 * 
	 * 登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Param("studentName") String studentName, String newPwd, HttpSession session, Model model) {
		Student stu = userService.findByStuName(studentName);
		String s = "/login";
		if (null != stu) {
			if (!stu.getStudentPwd().equals(newPwd)) {
				s = "login";
				return s;
			} else {
				session.setAttribute("user", stu);
				s = "home";

				// 页面容量
				int pageSize = 5;
				// 当前页码
				String pageIndex = "0";
				// 定义当前页码
				Integer currentPageNo = 0;
				if (null != pageIndex) {
					try {
						currentPageNo = Integer.valueOf(pageIndex);// .valueOf()把字符串转换为数字
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// 总数量(列表)
				int totalCount = 0;
				try {
					totalCount = answerService.count();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 总页数
				PageSupport pages = new PageSupport();
				pages.setCurrentPageNo(currentPageNo);
				pages.setPageSize(pageSize);
				pages.setTotalCount(totalCount);
				int totalPageCount = pages.getTotalPageCount();
				// 控制首页和尾页
				if (currentPageNo < 0) {
					currentPageNo = 0;
				} else if (currentPageNo > totalPageCount) {
					currentPageNo = totalPageCount;
				}
				List<Question> question = null;
				try {
					question = answerService.findAllQuestion(currentPageNo, pageSize);
				} catch (Exception e) {
					e.printStackTrace();
				}

				model.addAttribute("pages", pages);
				model.addAttribute("question", question);
				return s;
			}
		}
		return s;
	}

	// 老师登录
	@RequestMapping(value = "/teacherLogin", method = RequestMethod.GET)
	public String teacherLogin() {
		return "teacherLogin";
	}

	// 老师登录
	// @RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
	// public String teacherLogin(@Param("teacherName") String teacherName,
	// String teacherPwd, HttpSession session,
	// Model model) {
	// Teacher teacher = userService.findByTeacherName(teacherName);
	// String s = "";
	// if (null != teacher) {
	// if (!teacher.getTeacherPwd().equals(teacherPwd)) {
	// s = "teacherLogin";
	// return s;
	// } else {
	// s = "teacherattendance";
	// List<Question> question = answerService.findAllQuestiontea();
	// session.setAttribute("user", teacher);
	// model.addAttribute("question", question);
	// return s;
	// }
	// }
	// return s;
	// }

	// 老师给学生注册
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	// 老师给学生注册
	// @RequestMapping(value = "/register", method = RequestMethod.POST)
	// public String register(Student student, Model model) {
	// String s = "";
	// if (student != null) {
	// Student stu = new Student();
	// stu.setStudentName(student.getStudentName());
	// stu.setStudentPwd(student.getStudentPwd());
	// stu.setStudentNo(student.getStudentNo());
	// stu.setStuClass(student.getStuClass());
	// stu.setStudentSex(student.getStudentSex());
	// userService.addStudent(stu);
	// s = "teacherattendance";
	// return s;
	// }
	// return s;
	// }

	@RequestMapping(value = "/paging", method = RequestMethod.GET)
	public String paging() {
		return "paging";
	}

	@RequestMapping(value = "/paging", method = RequestMethod.POST)
	public String paging(int a) {
		return "student";
	}

	@RequestMapping(value = "/answer", method = RequestMethod.GET)
	public String answer() {
		return "answer";
	}

	// @RequestMapping(value = "/answer", method = RequestMethod.POST)
	// public String answer(Model model) {
	// Question question = new Question();
	// question = answerService.findAllQuestion();
	// return s;
	// }

	// @RequestMapping(value = "/answer", method = RequestMethod.GET)
	// public String answer() {
	// return "answer";
	// }

	/**
	 * 老师查看学生信息页面
	 */
	// @RequestMapping(value = "/teacherattendance", method = RequestMethod.GET)
	// public String teacheratendance() {
	// return "teacherattendance";
	// }

	/**
	 * 修改密码页面
	 */
	// @RequestMapping(value = "/studentUpdatePwd", method = RequestMethod.GET)
	// public String studentUpdatePwd() {
	// return "studentUpdatePwd";
	// }

	// @RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
	// public String findByTeacherNameAndTeacherPwd(@RequestParam("teacherId")
	// String teacherId) {
	//
	// return "teacherLogin";
	// }
	//
	// @RequestMapping(value = "/studentLogin", method = RequestMethod.POST)
	// public String findByStudentNameAndSPwd(@RequestParam("studentId") String
	// studentId) {
	// return "teacherLogin";
	// }

	// @RequestMapping(value = "/findByStudentNameAndStudentPwd", method =
	// RequestMethod.POST)
	// public ModelAndView findByStudentNameAndStudentPwd(Integer studentId) {
	// userService.findByStudentNameAndStudentPwd(studentId);
	// return null;
	// }
	//
	// /**
	// * 学生注册
	// */
	// @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	// public ModelAndView addStudent(Integer studentId) {
	// userService.addStudent(studentId);
	// return null;
	// }
	//
	/**
	 * 修改学生密码
	 */
	@RequestMapping(value = "/studentUpdatePwd", method = RequestMethod.GET)
	public String studentUpdatePwd() {
		return "/studentUpdatePwd";
	}

	/**
	 * 修改学生密码
	 */
	/* 3.相等则调用更新方法更新用户密码 */
	/* 4.成功或失败返回提示信息 */
	/* 1.获得浏览器用户表单提交的密码 */
	@RequestMapping(value = "/studentUpdatePwd", method = RequestMethod.POST)
	public String updateStudentByStudentpwd(String studentPwd, @Param("stuPwd1") String stuPwd1, String stuPwd2,
			HttpSession session, Model model) {
		String s = "studentUpdatePwd";
		Student stu = (Student) session.getAttribute("user");

		/* 2.判断用户提交的表单里两次密码是否相等 */
		if (stu.getStudentPwd().equals(studentPwd)) {
			if (stuPwd1.equals(stuPwd2)) {
				userService.updatePwd(stu.getId(), stuPwd1);
				s = "login";
				return s;
			}
		}

		return s;
	}

	// /**
	// * 修改老师密码
	// */
	// @RequestMapping(value = "/updateTeacherByTeacherName", method =
	// RequestMethod.POST)
	// public ModelAndView updateTeacherByTeacherName(Integer teacherId) {
	// userService.updateTeacherByTeacherName(teacherId);
	// return null;
	// }
	//
	// /**
	// * 根据studentId查询用户（显示学生信息）
	// */
	// @RequestMapping(value = "/selectStudentById", method =
	// RequestMethod.POST)
	// public String selectStudentById(@Param("studentId") Integer studentId) {
	// userService.selectStudentById(studentId);
	// return null;
	// }

}
