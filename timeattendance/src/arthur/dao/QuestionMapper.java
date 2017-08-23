package arthur.dao;

import java.util.List;

import arthur.entity.Question;

public interface QuestionMapper {
	// 学生提问
	Integer addQuestion(Question question);

	// 查询显示所有学生的提问信息
	List<Question> fingAll();

}
