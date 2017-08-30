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

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:43:25
 */
@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController {
	@Resource
	AttendanceService attendanceService;

	@RequestMapping(value = "/addattendanceSign", method = RequestMethod.GET)
	public String addAttendanceSign(Model model, HttpSession session) {
		Integer studentId = ((Student) session.getAttribute("student")).getId();
		Timestamp studentSign = new Timestamp(System.currentTimeMillis());
		Timestamp date = new Timestamp(System.currentTimeMillis());

		Integer i = attendanceService.addAttendanceSign(studentId, studentSign, date);
		if (i > 0) {
			model.addAttribute("attendance", "打考勤成功！");
			return "student";
		}
		model.addAttribute("attendance", "打考勤失败！");
		return "student";
	}

}
