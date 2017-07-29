package arthur.controller.question;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Question;
import arthur.entity.Student;
import arthur.service.QuestionService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月24日
 */
@Controller
@RequestMapping(value = "/arthur/question")
public class QuestionController {
	@Resource
	QuestionService questionService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String login() {
		return "/student";
	}

	// 提问者:提问者给出提问的内容
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String addQuestionContentQuestionTime(Question qu, Model model, HttpSession session) {
		qu.setQuestionContent(qu.getQuestionContent().trim());
		qu.setQuestionGiveIntegral(0);
		qu.setStudentId(((Student) session.getAttribute("user")).getId());
		qu.setQuestionTime(new Timestamp(System.currentTimeMillis()));
		questionService.addQuestion(qu);
		model.addAttribute("success", "添加成功！");
		return "/student";
	}
	//
	// // 提问者可以根据自己的id修改问题内容
	// @RequestMapping(value = "/updateQuestion", method = RequestMethod.POST)
	// public Integer updateStudentIdContent(Integer studentId, String content)
	// {
	// questionService.updateStudentIdQuestionContent(studentId, content);
	// return null;
	// }
}
