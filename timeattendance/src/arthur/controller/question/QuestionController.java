package arthur.controller.question;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.service.QuestionService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
@Controller
@RequestMapping("/arthur/question")
public class QuestionController {
	@Resource
	QuestionService questionService;

	// 提问者:提问者给出提问的内容和时间
	@RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
	public Integer addQuestionContentQuestionTime(String questionContent, Timestamp questionTime) {
		questionService.addQuestionContentQuestionTime(questionContent, questionTime);
		return null;
	}

	// 提问者可以根据自己的id修改问题内容
	@RequestMapping(value = "/updateQuestion", method = RequestMethod.POST)
	public Integer updateStudentIdContent(Integer studentId, String content) {
		questionService.updateStudentIdQuestionContent(studentId, content);
		return null;
	}
}
