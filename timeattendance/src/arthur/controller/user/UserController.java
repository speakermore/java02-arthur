package arthur.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	 * 老师登录
	 */
	@RequestMapping(value = "/teacherLogin", method = RequestMethod.GET)
	public String findByTeacherNameAndTeacherPwd() {
		return "teacherLogin";
	}

	@RequestMapping(value = "/studentLogin", method = RequestMethod.GET)
	public String findByStudentNameAndSPwd() {
		return "studentLogin";
	}

	@RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
	public String findByTeacherNameAndTeacherPwd(@RequestParam("teacherId") String teacherId) {

		return "teacherLogin";
	}

	@RequestMapping(value = "/studentLogin", method = RequestMethod.POST)
	public String findByStudentNameAndSPwd(@RequestParam("studentId") String studentId) {
		return "teacherLogin";
	}

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
