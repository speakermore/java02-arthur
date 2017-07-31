package arthur.service.impl.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.user.UserMapper;
import arthur.entity.Student;
import arthur.service.UserService;

/***
 * 
 * @author 谭夏男
 *
 *         2017年7月19日
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	// @Override
	// public Teacher findByTeacherNameAndTeacherPwd(Integer teacherId) {
	// return userMapper.findByTeacherNameAndTeacherPwd(teacherId);
	// }

	// @Override
	// public Integer addStudent(Integer studentId) {
	// return userMapper.addStudent(studentId);
	// }

	// @Override
	// public Integer updateStudentByStudentName(Integer studentId) {
	// return userMapper.updateStudentByStudentName(studentId);
	// }

	// @Override
	// public Integer updateTeacherByTeacherName(Integer teacherId) {
	// return userMapper.updateTeacherByTeacherName(teacherId);
	// }

	// @Override
	// public Student selectStudentById(Integer studentId) {
	// return userMapper.selectStudentById(studentId);
	// }

	@Override
	public Student findByStuName(String studentName) {
		return userMapper.findByStuName(studentName);
	}

	// 学生修改密码
	@Override
	public Integer updatePwd(Integer id, String studentPwd) {
		// TODO Auto-generated method stub
		return userMapper.updatePwd(studentPwd, id);
	}

	// @Override
	// public Teacher findByTeacherNameAndTeacherPwd(Integer teacherId) {
	// // TODO Auto-generated method stub
	// return null;
	// }

	// @Override
	// public Integer updateStudentByStudentName(Integer studentId) {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
