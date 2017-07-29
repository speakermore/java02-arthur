package arthur.controller.answer;

import javax.annotation.Resource;

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
	@Resource
	AnswerService answerService;

	// 查询所有的提问信息
	// @RequestMapping(value = "/question", method = RequestMapping.GET)
	// public String selectQuestion() {
	//
	// }

	// // 回答问题，给出答复内容，答复时间，答复者的id
	// @RequestMapping(value = "/addAnswer", method = RequestMethod.POST)
	// public ModelAndView addAnswer(String context, Integer answerId) {
	// answerService.addAnswer(context, answerId);
	// return null;
	// }
	//
	// /**
	// * 回答页面
	// */
	// @RequestMapping(value = "/answerindex", method = RequestMethod.GET)
	// public String answer() {
	//
	// return "answer";
	// }

}
