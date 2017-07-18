package arthur.dao.fabulous;

/**
 * 点赞
 * 
 * @auther 代益铨 2017年7月14日下午3:05:11
 */
public interface FabulousMapper {
	// 根据被点赞学生名字点赞,点赞时间
	public Integer addFabulousNameAndFabulousTime(Integer studentId);

	
}
