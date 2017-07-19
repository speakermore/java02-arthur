package arthur.dao.fabulous;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

/**
 * 点赞
 * 
 * @auther 代益铨 2017年7月14日下午3:05:11
 */
public interface FabulousMapper {
	// 根据被点赞学生id点赞,添加点赞时间
	public Integer addFabulousIdAndFabulousTime(@Param("studentId") Integer studentId,
			@Param("fabulousTime") Timestamp fabulousTime);

}
