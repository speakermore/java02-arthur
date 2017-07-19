package arthur.controller.fabulous;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.FabulousService;

@Controller
@RequestMapping("/arthur/fabulous")
public class FabulousController {
	@Resource
	FabulousService fabulousService;

	// 根据被点赞学生id点赞,添加点赞时间
	@RequestMapping(value = "/addFabulousIdAndFabulousTime", method = RequestMethod.POST)
	public ModelAndView addFabulousIdAndFabulousTime(Integer studentId) {
		fabulousService.addFabulousIdAndFabulousTime(studentId);
		return null;
	}
}
