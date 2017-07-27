package arthur.service;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Student;
import arthur.entity.Teacher;

/***
 * 
 * @author 谭夏男
 *
 *         2017年7月19日
 */
public interface UserService {
	/**
	 * 老师登录
	 */

	public Teacher findByTeacherNameAndTeacherPwd(Integer teacherId);

	/**
	 * 学生登录
	 */
	public Student findByStudentNameAndStudentPwd(@Param("stuname") String stuname);

	/**
	 * 老师给学生注册
	 */
	public Integer addStudent(Integer studentId);

	/**
	 * 修改学生密码
	 */
	public Integer updateStudentByStudentName(Integer studentId);

	/**
	 * 修改老师密码
	 */
	public Integer updateTeacherByTeacherName(Integer teacherId);

	/**
	 * 根据studentId查询用户（显示学生信息）
	 */
	public Student selectStudentById(Integer studentId);

}
