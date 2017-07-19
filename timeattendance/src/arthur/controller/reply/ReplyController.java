package arthur.controller.reply;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.ReplyService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
@Controller
@RequestMapping("/arthur/reply")
public class ReplyController {
	@Resource
	ReplyService replyService;

	// 根据提问者Id显示他的姓名
	@RequestMapping(value = "/selectReplyHelpName", method = RequestMethod.POST)
	public ModelAndView selectReplyHelpName(Integer studentId) {
		replyService.selectReplyHelpName(studentId);
		return null;
	}

	// 添加提问的问题
	@RequestMapping(value = "/addReply", method = RequestMethod.POST)
	public ModelAndView addReply(Integer studentId) {
		replyService.addReply(studentId);
		return null;
	}

	// 根据回答问题显示回答问题者的姓名
	@RequestMapping(value = "/selectReplyAnswerName", method = RequestMethod.POST)
	public ModelAndView selectReplyAnswerName(Integer studentId) {
		replyService.selectReplyAnswerName(studentId);
		return null;
	}
}
