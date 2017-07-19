package arthur.service.impl.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.user.UserMapper;
import arthur.entity.Student;
import arthur.entity.Teacher;
import arthur.service.UserService;


/***
 * 
 * @author 谭夏男
 *
 * 2017年7月19日
 */
//@Service注解表明此类为业务层，写在现实类的前面
@Service
public class UserServiceImpl implements UserService {
	//@Resource为自动注入的注解，表明此类要通过Spring容器完成注入
	@Resource
	private UserMapper userMapper;

	@Override
	public Teacher findByTeacherNameAndTeacherPwd(Integer teacherId) {
		return userMapper.findByTeacherNameAndTeacherPwd(teacherId);
	}

	@Override
	public Student findByStudentNameAndStudentPwd(Integer studentId) {
		return userMapper.findByStudentNameAndStudentPwd(studentId);
	}

	@Override
	public Integer addStudent(Integer studentId) {
		return userMapper.addStudent(studentId);
	}

	@Override
	public Integer updateStudentByStudentName(Integer studentId) {
		return userMapper.updateStudentByStudentName(studentId);
	}

	@Override
	public Integer updateTeacherByTeacherName(Integer teacherId) {
		return userMapper.updateTeacherByTeacherName(teacherId);
	}

	@Override
	public Student selectStudentById(Integer studentId) {
		return userMapper.selectStudentById(studentId);
	}
	

	

	
	
}
