package arthur.service;

import java.util.List;

import arthur.entity.StuClass;

public interface StuClassService {
	// 查询班级并在注册页面显示
	List<StuClass> fingAll();
}
