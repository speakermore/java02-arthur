package arthur.service;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:52:29
 */
public interface AnswerService {
	// 回答问题，给出答复内容，答复时间，答复者的id
	public Integer addAnswer(@Param("context") String context, @Param("answerId") Integer answerId);
}
