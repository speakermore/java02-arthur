package arthur.controller;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Question;
import arthur.entity.Student;
import arthur.service.QuestionService;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {
	@Resource
	QuestionService questionService;

	@RequestMapping(value = "/context", method = RequestMethod.POST)
	public String context(@RequestParam("questionContent") String questionContent,
			@RequestParam("questionGiveIntegral") Integer questionGiveIntegral, Model model, HttpSession session) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		if (questionGiveIntegral == null || questionGiveIntegral.equals("")) {
			questionGiveIntegral = 0;
		}
		int studentId = ((Student) session.getAttribute("student")).getId();
		Question question = new Question();
		question.setQuestionContent(questionContent);
		question.setQuestionGiveIntegral(questionGiveIntegral);
		question.setStudentId(studentId);
		question.setQuestionTime(time);
		int i = questionService.addQuestion(question);
		if (i > 0) {
			model.addAttribute("question", "提交问题成功!");
			return "student";
		}
		model.addAttribute("question", "提交问题失败!");
		return "student";
	}
}
