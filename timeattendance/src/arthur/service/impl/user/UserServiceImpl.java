package arthur.service.impl.user;

import arthur.dao.user.UserMapper;
import arthur.service.user.UserService;

public class UserServiceImpl implements UserService {
	// @Resource为自动注入的注解，表明此类要通过Spring容器完成注入
	@Resource
	private UserMapper userMapper;

	public User findByTeacherNameAndTeacherPwd(String teacherId, String teacherPwd) {
		// TODO Auto-generated method stub
		return userMapper.findByTeacherNameAndTeacherPwd(teacherId, teacherPwd);
	}

	public User findByStudentNameAndStudentPwd(String studentId, String studentPwd) {
		// TODO Auto-generated method stub
		return userMapper.findByStudentNameAndStudentPwd(studentId, studentPwd);
	}

	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	public Integer updateUserByStudentName(String studentName, String studentPwd) {
		// TODO Auto-generated method stub
		return ((UserService) userMapper).updateUserByStudentName(studentName, studentPwd);
	}

	public Integer updateUserByTeacherName(String teacherName, String teacherPwd) {
		// TODO Auto-generated method stub
		return userMapper.updateUserByTeacherName(teacherName, teacherPwd);
	}

	public User selectUserByStudentName(Integer studentName) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByStudentName(studentName);
	}

}
