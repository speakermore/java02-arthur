package arthur.controller.integral;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.IntegralService;

@Controller
@RequestMapping("/arthur/integral")
public class IntegralController {
	@Resource
	IntegralService integralService;

	// 通过学生id添加积分
	@RequestMapping(value = "/addIntegral", method = RequestMethod.POST)
	public ModelAndView addIntegral(Integer studentId, Integer integralNum) {
		integralService.addIntegral(studentId, integralNum);
		return null;
	}

	// 通过提问给回答者id积分奖励
	@RequestMapping(value = "/updateIntegral", method = RequestMethod.POST)
	public ModelAndView updateIntegral(Integer studentId, Integer giftPoints) {
		integralService.updateIntegral(studentId, giftPoints);
		return null;
	}
}
