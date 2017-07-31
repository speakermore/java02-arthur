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

}
