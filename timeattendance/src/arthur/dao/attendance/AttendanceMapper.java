package arthur.dao.attendance;

import arthur.entity.Attendance;

public interface AttendanceMapper {
	// 根据学生id，签到
	public Integer addStudentSign(Attendance attendance);

	// 根据学生ID签退
	// public Integer updatestudentOut(@Param("studentId") Integer studentId,
	// @Param("studentOut") Timestamp studentOut);

	// 老师通过输入学生ID查询该学生的考勤信息
	// public List<Attendance> findbyStudentId(@Param("studentId") Integer
	// studentId);
}
