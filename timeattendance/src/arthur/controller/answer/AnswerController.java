package arthur.controller.answer;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.AnswerService;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:59:04
 */
@Controller
@RequestMapping("/arthur/answer")
public class AnswerController {
	@Resource
	AnswerService answerService;

	// 回答问题，给出答复内容，答复时间，答复者的id
	@RequestMapping(value = "/addAnswer", method = RequestMethod.POST)
	public ModelAndView addAnswer(String context, Integer answerId) {
		answerService.addAnswer(context, answerId);
		return null;
	}

	/**
	 * 回答页面
	 */
	@RequestMapping(value = "/answerindex", method = RequestMethod.GET)
	public String answer() {
		return "answer";
	}

}
