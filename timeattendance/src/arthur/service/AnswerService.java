package arthur.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Question;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:52:29
 */
public interface AnswerService {
	// 回答问题，给出答复内容，答复时间，答复者的id
	// public Integer addAnswer(@Param("context") String context,
	// @Param("answerId") Integer answerId);

	// 根据学生id查询所有的提问信息
	public List<Question> findAllQuestion(@Param("currentPageNo") Integer currentPageNo,
			@Param("pageSize") Integer pageSize);

	// 获取提问的记录总数
	public Integer count();
}
