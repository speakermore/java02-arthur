package arthur.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Attendance;

public interface AttendanceService {
	public Integer addStudentSign(@Param("studentId") Integer studentId);

	public Integer updatestudentOutByStudentName(@Param("studentId") Integer studentId);

	public List<Attendance> findbyStudentNameAndStuClass(@Param("studentId") Integer studentId);
}
