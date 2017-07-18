package arthur.dao.attendance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Attendance;

public interface AttendanceMapper {
	// 根据学生id，签到
	public Integer addStudentSign(@Param("studentId") Integer studentId);

	// 根据学生ID签退
	public Integer updatestudentOutByStudentName(@Param("studentId") Integer studentId);

	// 老师通过输入学生ID查询该学生的考勤信息
	public List<Attendance> findbyStudentNameAndStuClass(@Param("studentId") Integer studentId);;
}
