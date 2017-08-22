package arthur.controller;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Student;
import arthur.service.AttendanceService;

@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController {
	@Resource
	AttendanceService attendance;

	@RequestMapping(value = "/addattendanceSign", method = RequestMethod.GET)
	public String addAttendanceSign(Model model, HttpSession session) {
		Integer studentId = ((Student) session.getAttribute("student")).getId();
		Timestamp studentSign = new Timestamp(System.currentTimeMillis());
		Timestamp date = new Timestamp(System.currentTimeMillis());

		Integer i = attendance.addAttendanceSign(studentId, studentSign, date);
		if (i > 0) {
			model.addAttribute("success", "成功！");
			return "student";
		}
		model.addAttribute("success", "失败！");
		return "student";
	}

	// @RequestMapping(value = "/addattendanceOut", method = RequestMethod.GET)
	// public String addAttendanceOut(Model model, HttpSession session) {
	// Integer studentId = ((Student) session.getAttribute("student")).getId();
	// Date date = new Date();
	// attendance.updateAttendanceOut(studentId, date);
	// return "student";
	// }

}
