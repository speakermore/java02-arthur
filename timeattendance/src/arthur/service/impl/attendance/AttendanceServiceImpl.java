package arthur.service.impl.attendance;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.attendance.AttendanceMapper;
import arthur.entity.Attendance;
import arthur.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Resource
	public AttendanceMapper attendanceMapper;

	@Override
	public Integer addStudentSign(Integer studentId) {
		return attendanceMapper.addStudentSign(studentId);
	}

	@Override
	public Integer updatestudentOutByStudentName(Integer studentId) {
		return attendanceMapper.updatestudentOutByStudentName(studentId);
	}

	@Override
	public List<Attendance> findbyStudentNameAndStuClass(Integer studentId) {
		return attendanceMapper.findbyStudentNameAndStuClass(studentId);
	}

}
