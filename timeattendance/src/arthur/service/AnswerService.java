package arthur.service;

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
}
