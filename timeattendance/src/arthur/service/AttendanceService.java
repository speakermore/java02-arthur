package arthur.service;

import java.sql.Timestamp;
import java.util.List;

import arthur.entity.Attendance;

public interface AttendanceService {
	// 根据学生id，签到
	public Integer addStudentSign(Integer studentId);

	// 根据学生ID签退
	public Timestamp updatestudentOutByStudentName(Integer studentId);

	// 老师通过输入学生ID查询该学生的考勤信息
	public List<Attendance> findbyStudentNameAndStuClass(Integer studentId);
}
