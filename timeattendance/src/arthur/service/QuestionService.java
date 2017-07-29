package arthur.service;

import arthur.entity.Question;

public interface QuestionService {
	// 提问者:提问者给出提问的内容和时间
	public Integer addQuestion(Question qu);

	// // 提问者可以根据自己的id修改问题内容
	// public Integer updateStudentIdQuestionContent(Integer studentId, String
	// questionContent);

}
