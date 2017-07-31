package arthur.service;

import arthur.entity.Attendance;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
public interface AttendanceService {
	// 根据学生id，签到
	public Integer addStudentSign(Attendance attendance);

	// 根据学生ID签退
	// public Integer updatestudentOut(Integer studentId);

	// 老师通过输入学生ID查询该学生的考勤信息
	// public List<Attendance> findbyStudentId(Integer studentId);
}
