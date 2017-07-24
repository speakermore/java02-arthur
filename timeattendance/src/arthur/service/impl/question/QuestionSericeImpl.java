package arthur.service.impl.question;

import java.sql.Timestamp;

import javax.annotation.Resource;

import arthur.dao.question.QuestionMpper;
import arthur.service.QuestionService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
public class QuestionSericeImpl implements QuestionService {
	@Resource
	QuestionMpper questionMpper;

	@Override
	public Integer addQuestionContent(String questionContent) {
		// TODO Auto-generated method stub
		return questionMpper.addQuestionContentQuestionTime(questionContent, new Timestamp(System.currentTimeMillis()));
	}

	@Override
	public Integer updateStudentIdQuestionContent(Integer studentId, String questionContent) {
		// TODO Auto-generated method stub
		return questionMpper.updateStudentIdQuestionContent(studentId, questionContent);
	}

}
