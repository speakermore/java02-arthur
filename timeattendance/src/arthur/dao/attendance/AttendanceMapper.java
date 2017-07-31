package arthur.dao.attendance;

import arthur.entity.Attendance;

public interface AttendanceMapper {
	// 根据学生id，签到
	public Integer addStudentSign(Attendance attendance);

}
