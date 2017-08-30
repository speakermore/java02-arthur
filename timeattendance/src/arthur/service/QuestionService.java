package arthur.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Question;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:42:17
 */
public interface QuestionService {
	// 学生提问
	Integer addQuestion(Question question);

	// 查询显示所有学生的提问信息
	List<Question> findAll();

	// 根据id查看该学生的提问信息
	Question fingById(@Param("id") Integer id);

	// 查看自己的提问内容和答复者的信息
	List<Question> findAllMy(@Param("id") Integer id);

	// 查看有答复的信息
	Question findAllById(@Param("studentId") Integer studentId);
}
