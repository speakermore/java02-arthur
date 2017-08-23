package arthur.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.UserMapper;
import arthur.entity.Student;
import arthur.entity.Teacher;
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

	@Override
	public Student sLogin(String name) {
		return userMapper.sLogin(name);
	}

	@Override
	public Teacher tLogin(String name) {
		return userMapper.tLogin(name);
	}

	@Override
	public Integer updatePwd(Integer id, String stuPwd1) {
		return userMapper.updatePwd(id, stuPwd1);
	}

	@Override
	public Integer addStudent(Student student) {
		return userMapper.addStudent(student);
	}

	@Override
	public Student findByStudentId(Integer studentId) {
		return userMapper.findByStudentId(studentId);
	}

}
