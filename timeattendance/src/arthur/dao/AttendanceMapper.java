package arthur.dao;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper {
	// 学生打考勤签到
	Integer addAttendanceSign(@Param("studentId") Integer studentId, @Param("studentSign") Timestamp studentSign,
			@Param("date") Timestamp date);

	// 学生打考勤签退
	// Integer updateAttendanceOut(@Param("studentId") Integer studentId,
	// @Param("date") Date date);

}
