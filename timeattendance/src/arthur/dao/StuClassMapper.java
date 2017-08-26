package arthur.dao;

import java.util.List;

import arthur.entity.StuClass;

/**
 * 
 * @auther 代益铨 2017年8月25日上午11:23:29
 */
public interface StuClassMapper {
	// 查询班级并在注册页面显示
	List<StuClass> fingAll();
}
