package arthur.controller.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import arthur.service.AnswerService;

/**
 * 
 * @auther 代益铨 2017年7月24日上午9:59:04
 */
@Controller
@RequestMapping("/arthur/answer")
public class AnswerController {
	// @Resource
	AnswerService answerService;

}
