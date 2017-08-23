package arthur.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.AttendanceMapper;
import arthur.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Resource
	private AttendanceMapper attendanceMapper;

	@Override
	public Integer addAttendanceSign(Integer studentId, Timestamp studentSign, Timestamp date) {
		return attendanceMapper.addAttendanceSign(studentId, studentSign, date);
	}

}
