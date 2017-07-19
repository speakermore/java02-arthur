package arthur.dao.stuclass;

import org.apache.ibatis.annotations.Param;

/***
 * 
 * @author 谭夏男
 *
 */
public interface StuClassMapper {
	// 根据学生id,分配班级
	public Integer addStuClass(@Param("studentId")Integer studentId);
	
}
