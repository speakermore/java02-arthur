package arthur.service.impl.question;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.question.QuestionMapper;
import arthur.service.QuestionService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
@Service
public class QuestionSericeImpl implements QuestionService {
	@Resource
	QuestionMapper questionMpper;

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
