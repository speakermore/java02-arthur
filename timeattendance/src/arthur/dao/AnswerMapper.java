package arthur.dao;

import arthur.entity.Answer;

/**
 * 
 * @auther 代益铨 2017年8月25日上午11:23:41
 */
public interface AnswerMapper {
	// 添加回答内容
	Integer addAnswer(Answer answer);

	// 回答问题后，给提问表的answerId加自己的id
	Integer addQuestion(Answer answer);
}
