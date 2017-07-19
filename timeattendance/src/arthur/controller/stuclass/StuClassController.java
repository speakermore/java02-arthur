package arthur.controller.stuclass;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import arthur.service.StuClassService;
/***
 * 
 * @author 谭夏男
 *
 */

@Controller
@RequestMapping("/arthur/stuclass")
public class StuClassController {
	@Resource
	StuClassService stuClassService;
	
	// 根据学生id,分配班级
	@RequestMapping(value = "/addStuClass", method = RequestMethod.POST)
	public ModelAndView addStuClass(Integer studentId){
		stuClassService.addStuClass(studentId);
		return null;
	}
}
