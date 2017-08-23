package arthur.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.QuestionMapper;
import arthur.entity.Question;
import arthur.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Resource
	private QuestionMapper questionMapper;

	@Override
	public Integer addQuestion(Question question) {
		return questionMapper.addQuestion(question);
	}

	@Override
	public List<Question> fingAll() {
		return questionMapper.fingAll();
	}

}
