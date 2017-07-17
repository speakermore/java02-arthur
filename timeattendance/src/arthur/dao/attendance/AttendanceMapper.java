package arthur.dao.attendance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Attendance;

import arthur.entity.Student;

public interface AttendanceMapper {
	// 根据学生姓名，签到
	public Integer addStudentSign(Student student);

	// 根据学生姓名，签退
	public Integer updatestudentOutByStudentName(@Param("studentName") String studentName);

	// 老师通过输入学生姓名查询该学生的考勤信息
	public List<Attendance> findbyStudentNameAndStuClass(@Param("studentName") Integer studentName);
;
}
