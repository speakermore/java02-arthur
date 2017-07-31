package arthur.service.impl.user;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import arthur.dao.user.UserMapper;
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

	// 老师登录
	@Override
	public Teacher findByTeacherName(@Param("teacherName") String teacherName) {
		return userMapper.findByTeacherName(teacherName);

	}

	// 学生注册
	@Override
	public Integer addStudent(Student student) {
		return userMapper.addStudent(student);
	}

	// 学生登录
	@Override
	public Student findByStuName(String studentName) {
		return userMapper.findByStuName(studentName);
	}

	// 修改密码
	@Override
	public Integer updatePwd(String studentPwd, Integer id) {
		return userMapper.updatePwd(studentPwd, id);
	}

}
