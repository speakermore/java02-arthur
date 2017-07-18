package arthur.dao.fabulous;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Fabulous;
import arthur.entity.Student;

/**
 * 点赞
 * 
 * @auther 代益铨 2017年7月14日下午3:05:11
 */
public interface FabulousMapper {
	// 根据学生id给学生点赞
	public Integer addFabulous(@Param("fabulous") Fabulous fabulous, @Param("studentId") Student studentId);

}
