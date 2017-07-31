package arthur.dao.answer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Question;

public interface AnswerMapper {

	// 根据学生id查询所有的提问信息
	public List<Question> findAllQuestion(@Param("currentPageNo") Integer currentPageNo,
			@Param("pageSize") Integer pageSize);

	public List<Question> findAllQuestiontea();

	// 获取提问的记录总数
	public Integer count();

	// 回答问题，给出答复内容，答复时间，答复者的id
	// public Integer addAnswer(@Param("context") String context,
	// @Param("answerTime") Timestamp answerTime,
	// @Param("answerId") Integer answerId);

	// 根据id查询提问的问题
	// public Answer getQuestionByStuId(@Param("studentId") String studentId);
}
