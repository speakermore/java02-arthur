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

	// 发表问题
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
			model.addAttribute("questions", "提交问题成功!");
			return "student";
		}
		model.addAttribute("questions", "提交问题失败!");
		return "student";
	}

	// 根据id查看该学生的提问信息
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String findQuestionById(@RequestParam("id") Integer id, Model model) {
		Question question = questionService.fingById(id);
		model.addAttribute("ques", question);
		return "question";
	}

	// 根据id查看提问后的回答信息
	// @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
	// public String findbyid(@RequestParam("id") Integer id, Model model) {
	//
	// return "answer";
	// }

}
