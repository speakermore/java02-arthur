package arthur.controller.attendance;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import arthur.service.AttendanceService;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {
	@Resource
	AttendanceService attendanceService;

	@RequestMapping
	public String addStudentSign(Integer studentId) {
		attendanceService.addStudentSign(studentId);
		return null;
	}
}
