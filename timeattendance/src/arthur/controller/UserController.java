package arthur.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Student;
import arthur.entity.Teacher;
import arthur.service.UserService;

/**
 * 
 * @auther 代益铨 2017年8月19日下午3:17:41
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	UserService user;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam("name") String name, @RequestParam("pwd") String pwd, HttpSession session,
			Model model) {
		if (name.equals(null) || name == "") {
			return "login";
		}
		Student s = user.sLogin(name);
		Teacher t = user.tLogin(name);
		if (s != null) {
			if (s.getStudentPwd().equals(pwd)) {
				session.setAttribute("student", s);
				return "home";
			} else if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				return "teacherattendance";
			}
			return "login";
		}
		if (t != null) {
			s = user.sLogin(name);
			if (t.getTeacherPwd().equals(pwd)) {
				session.setAttribute("teacher", t);
				return "teacherattendance";
			} else if (s.getStudentPwd().equals(pwd)) {
				session.setAttribute("student", s);
				return "home";
			}
			return "login";
		}
		return "login";
	}
}
