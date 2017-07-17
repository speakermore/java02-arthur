package arthur.dao.attendance;

import arthur.entity.Attendance;

public interface AttendanceMapper {
	// 根据学生id，签到签退
	public Integer addAttendance(Attendance attendance);
}
