package arthur.service;

import java.util.List;

import arthur.entity.StuClass;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:42:23
 */
public interface StuClassService {
	// 查询班级并在注册页面显示
	List<StuClass> fingAll();
}
