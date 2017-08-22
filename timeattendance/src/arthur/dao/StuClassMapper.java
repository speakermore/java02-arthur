package arthur.dao;

import java.util.List;

import arthur.entity.StuClass;

public interface StuClassMapper {
	// 查询班级并在注册页面显示
	List<StuClass> fingAll();
}
