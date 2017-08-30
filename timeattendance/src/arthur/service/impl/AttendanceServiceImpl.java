package arthur.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.AttendanceMapper;
import arthur.service.AttendanceService;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:42:45
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Resource
	private AttendanceMapper attendanceMapper;

	@Override
	public Integer addAttendanceSign(Integer studentId, Timestamp studentSign, Timestamp date) {
		return attendanceMapper.addAttendanceSign(studentId, studentSign, date);
	}

}
