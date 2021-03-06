package arthur.service;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
public interface AttendanceService {
	// 学生打考勤签到
	Integer addAttendanceSign(@Param("studentId") Integer studentId, @Param("studentSign") Timestamp studentSign,
			@Param("date") Timestamp date);

	// 学生打考勤签退
	// Integer updateAttendanceOut(@Param("studentId") Integer studentId,
	// @Param("date") Date date);
}
