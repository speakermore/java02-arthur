package arthur.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Student;
import arthur.service.UserService;

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
	public String login(@Param("studentName") String studentName, String newPwd, Model model, HttpSession session) {
		Student stu = userService.findByStuName(studentName);
		if (stu != null) {
			if (stu.getStudentPwd().equals(newPwd)) {
				session.setAttribute("user", stu);
				model.addAttribute("home");
			}
		}
		return "home";
	}

	/**
	 * 
	 * 首页
	 */
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public String login() {
	// return "login";
	// }

	/**
	 * 学生个人信息
	 * 
	 * @return
	 */
	// @RequestMapping(value = "/student", method = RequestMethod.GET)
	// public String personalInformation() {
	// return "student";
	// }

	/**
	 * 回答页面
	 */
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
	// /**
	// * 修改学生密码
	// */
	// @RequestMapping(value = "/updateStudentByStudentName", method =
	// RequestMethod.POST)
	// public ModelAndView updateStudentByStudentName(Integer studentId) {
	// userService.updateStudentByStudentName(studentId);
	// return null;
	// }
	//
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
