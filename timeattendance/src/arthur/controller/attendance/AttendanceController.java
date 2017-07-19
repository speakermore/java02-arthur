package arthur.controller.attendance;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.AttendanceService;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
@Controller
@RequestMapping("/arthur/attendance")
public class AttendanceController {
	@Resource
	AttendanceService attendanceService;

	// 根据学生id，签到
	@RequestMapping(value = "/addStudentSign", method = RequestMethod.POST)
	public ModelAndView addStudentSign(Integer studentId) {
		attendanceService.addStudentSign(studentId);
		return null;
	}

	// 根据学生ID签退
	@RequestMapping(value = "/updatestudentOut", method = RequestMethod.POST)
	public ModelAndView updatestudentOut(Integer studentId) {
		attendanceService.updatestudentOut(studentId);
		return null;
	}

	// 老师通过输入学生ID查询该学生的考勤信息
	@RequestMapping(value = "/findbyStudentId", method = RequestMethod.POST)
	public String findbyStudentId(Integer studentId) {
		attendanceService.findbyStudentId(studentId);
		return null;
	}
}
