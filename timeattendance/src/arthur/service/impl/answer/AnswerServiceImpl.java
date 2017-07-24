package arthur.service.impl.answer;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.answer.AnswerMapper;
import arthur.service.AnswerService;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:55:50
 */
@Service
public class AnswerServiceImpl implements AnswerService {
	@Resource
	public AnswerMapper answerMapper;

	@Override
	public Integer addAnswer(String context, Integer answerId) {
		return answerMapper.addAnswer(context, new Timestamp(System.currentTimeMillis()), answerId);
	}

}
