package arthur.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.AttendanceMapper;
import arthur.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Resource
	private AttendanceMapper attendance;

	@Override
	public Integer addAttendanceSign(Integer studentId, Timestamp studentSign, Timestamp date) {
		return attendance.addAttendanceSign(studentId, studentSign, date);
	}

	// @Override
	// public Integer updateAttendanceOut(Integer studentId, Date date) {
	// return attendance.updateAttendanceOut(studentId, date);
	// }

}
