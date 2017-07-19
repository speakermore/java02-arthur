package arthur.service.impl.attendance;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.attendance.AttendanceMapper;
import arthur.entity.Attendance;
import arthur.service.AttendanceService;

/**
 * 
 * @auther 代益铨 2017年7月19日下午5:19:45
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Resource
	public AttendanceMapper attendanceMapper;

	@Override
	public Integer addStudentSign(Integer studentId) {
		return attendanceMapper.addStudentSign(studentId, new Timestamp(System.currentTimeMillis()));
	}

	@Override
	public Integer updatestudentOut(Integer studentId) {
		return attendanceMapper.updatestudentOut(studentId, new Timestamp(System.currentTimeMillis()));
	}

	@Override
	public List<Attendance> findbyStudentId(Integer studentId) {
		return attendanceMapper.findbyStudentId(studentId);
	}

}
