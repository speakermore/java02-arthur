package arthur.dao.user;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/*
	 * 老师登录
	 */
	public User findByTeacherNameAndTeacherPwd(@Param("teacherName") String teacherId,
			@Param("teacherPwd") String teacherPwd);

	/**
	 * 学生登录
	 */
	public User findByStudentNameAndStudentPwd(@Param("studentName") String studentId,
			@Param("studentPwd") String studentPwd);

	/**
	 * 学生注册
	 */
	public Integer addUser(User user);

	/**
	 * 修改学生密码
	 */
	public Integer updateUserByStudentName(@Param("studentName") String studentName,
			@Param("studentPwd") String studentPwd);

	/**
	 * 修改老师密码
	 */
	public Integer updateUserByTeacherName(@Param("teacherName") String teacherName,
			@Param("teacherPwd") String teacherPwd);

	/**
	 * 根据studentId查询用户（显示学生信息）
	 */
	public User selectUserByStudentName(@Param("studentName") Integer studentName);

}
