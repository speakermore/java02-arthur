package arthur.service;

import java.util.List;

import arthur.entity.Question;

public interface QuestionService {
	// 学生提问
	Integer addQuestion(Question question);

	// 查询显示所有学生的提问信息
	List<Question> fingAll();
}
