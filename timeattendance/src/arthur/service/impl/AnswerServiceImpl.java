package arthur.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.AnswerMapper;
import arthur.entity.Answer;
import arthur.service.AnswerService;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:42:39
 */
@Service
public class AnswerServiceImpl implements AnswerService {
	@Resource
	private AnswerMapper answerMapper;

	@Override
	public Integer addAnswer(Answer answer) {
		return answerMapper.addAnswer(answer);
	}

	@Override
	public Integer addQuestion(Answer answer) {
		return answerMapper.addQuestion(answer);
	}

	@Override
	public List<Answer> findAllById(Integer answerId) {
		return answerMapper.findAllById(answerId);
	}

}
