package arthur.dao.Class;

import arthur.entity.StuClass;

public interface StuClassMapper {
	// 根据学生id,分配班级
	public Integer addClass(StuClass stuclass);
}
