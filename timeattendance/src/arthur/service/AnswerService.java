package arthur.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Answer;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:52:29
 */
public interface AnswerService {
	// 添加回答内容
	Integer addAnswer(Answer answer);

	// 回答问题后，给提问表的answerId加自己的id
	Integer addQuestion(Answer answer);

	// 查看所有答复者回答的信息
	List<Answer> findAllById(@Param("answerId") Integer answerId);
}
