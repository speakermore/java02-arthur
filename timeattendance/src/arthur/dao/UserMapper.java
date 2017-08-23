package arthur.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Student;
import arthur.entity.Teacher;

/***
 * 
 * @author 谭夏男
 *
 *         2017年7月19日
 */
public interface UserMapper {
	// 学生登录
	Student sLogin(@RequestParam("name") String name);

	// 老师登录
	Teacher tLogin(@RequestParam("name") String name);

	// 学生根据id修改密码
	Integer updatePwd(@Param("id") Integer id, @Param("stuPwd1") String stuPwd1);

	// 老师给学生注册
	Integer addStudent(Student student);

	// 查询学生信息
	Student findByStudentId(@Param("studentId") Integer studentId);

}
