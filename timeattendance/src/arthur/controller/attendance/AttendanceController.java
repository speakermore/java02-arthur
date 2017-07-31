package arthur.controller.attendance;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Attendance;
import arthur.entity.Student;
import arthur.service.AttendanceService;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
@Controller
@RequestMapping(value = "/arthur/attendance")
public class AttendanceController {
	@Resource
	AttendanceService attendanceService;

	@RequestMapping(value = "/addStudentSign", method = RequestMethod.POST)
	public String addStudentSign(Attendance att, Model model, HttpSession session) {
		Student stu = (Student) session.getAttribute("user");
		att.setStudentId(stu.getId());
		att.setStudentSign(new Timestamp(System.currentTimeMillis()));
		attendanceService.addStudentSign(att);
		model.addAttribute("sign", att);
		return "student";
	}

	// // 根据学生ID签退
	// @RequestMapping(value = "/updatestudentOut", method = RequestMethod.POST)
	// public ModelAndView updatestudentOut(Integer studentId) {
	// attendanceService.updatestudentOut(studentId);
	// return null;
	// }
	//
	// // 老师通过输入学生ID查询该学生的考勤信息
	// @RequestMapping(value = "/findbyStudentId", method = RequestMethod.POST)
	// public String findbyStudentId(Integer studentId) {
	// attendanceService.findbyStudentId(studentId);
	// return null;
	// }
}
