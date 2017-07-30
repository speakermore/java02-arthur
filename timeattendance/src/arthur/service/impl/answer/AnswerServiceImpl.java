package arthur.service.impl.answer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.answer.AnswerMapper;
import arthur.entity.Question;
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
	public List<Question> findAllQuestion(Integer currentPageNo, Integer pageSize) {
		return answerMapper.findAllQuestion(currentPageNo, pageSize);
	}

	@Override
	public Integer count() {
		return answerMapper.count();
	}

	// @Override
	// public Integer addAnswer(String context, Integer answerId) {
	// return answerMapper.addAnswer(context, new
	// Timestamp(System.currentTimeMillis()), answerId);
	// }

}
