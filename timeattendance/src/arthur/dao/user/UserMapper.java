package arthur.dao.user;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Student;
import arthur.entity.Teacher;

public interface UserMapper {
	/**
	 * 老师登录
	 */
	public Teacher findByTeacherNameAndTeacherPwd(Integer teacherId);

	/**
	 * 学生登录
	 */
	public Student findByStudentNameAndStudentPwd(Integer studentId);

	/**
	 * 老师给学生注册
	 */
	public Integer addTeacher(Integer studentId);

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
	public Student selectStudentById(@Param("studentId") Integer studentId);

}
