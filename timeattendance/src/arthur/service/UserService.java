package arthur.service;

import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Student;
import arthur.entity.Teacher;

/***
 * 
 * @author 谭夏男
 *
 *         2017年7月19日
 */
public interface UserService {
	// 学生登录
	Student sLogin(@RequestParam("name") String name);

	// 老师登录
	Teacher tLogin(@RequestParam("name") String name);

}
