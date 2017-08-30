package arthur.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Answer;
import arthur.entity.Question;
import arthur.entity.Student;
import arthur.service.AnswerService;
import arthur.service.QuestionService;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:43:34
 */
@Controller
@RequestMapping(value = "/question")
public class QuestionController {
	@Resource
	QuestionService questionService;
	@Resource
	AnswerService answerService;

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

	// 老师根据id查看该学生的提问信息
	@RequestMapping(value = "/sel", method = RequestMethod.GET)
	public String findQuestion(@RequestParam("id") Integer id, Model model) {
		Question question = questionService.fingById(id);
		model.addAttribute("ques", question);
		return "teacheranswer";
	}

	// 根据id查看提问后的回答信息
	@RequestMapping(value = "/findAllById", method = RequestMethod.GET)
	public String findAllById(@RequestParam("studentId") Integer studentId, @RequestParam("answerId") Integer answerId,
			Model model) {
		Question qu = questionService.findAllById(studentId);
		model.addAttribute("question", qu);
		List<Answer> an = answerService.findAllById(answerId);
		model.addAttribute("answer", an);
		return "answer";
	}

}
