package arthur.dao.attendance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Attendance;
import arthur.entity.StuClass;
import arthur.entity.Student;

public interface AttendanceMapper {
	// 根据学生姓名，签到
	public Integer addAttendance(Student studentName);

	// 根据学生姓名，签退
	public Integer updateAttendance(Student studentName);

	// 老师通过输入学生姓名、班级查询该学生的考勤信息
	public List<Attendance> findbyStudentNameAndStuClass(@Param("name") Student name,
			@Param("stuclass") StuClass stuclass);
}
