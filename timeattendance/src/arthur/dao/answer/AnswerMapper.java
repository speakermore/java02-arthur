package arthur.dao.answer;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Answer;

public interface AnswerMapper {
	// 回答问题，给出答复内容，答复时间，答复者的id
	public Integer addAnswer(@Param("context") String context, @Param("answerTime") Timestamp answerTime,
			@Param("answerId") Integer answerId);

	// 根据id查询提问的问题
	public Answer getQuestionByStuId(@Param("studentId") String studentId);
}
