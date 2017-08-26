package arthur.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.AnswerMapper;
import arthur.entity.Answer;
import arthur.service.AnswerService;

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

}
