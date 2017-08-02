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

	public Teacher findByTeacherName(@Param("teacherName") String teacherName);

	/**
	 * 学生登录
	 */

	public Student findByStuName(@Param("studentName") String studentName);

	/**
	 * 老师给学生注册
	 */
	public Integer addStudent(Student student);

	/**
	 * 修改学生密码
	 */
	public Integer updatePwd(@Param("studentPwd") String studentPwd, @Param("id") Integer id);

}
