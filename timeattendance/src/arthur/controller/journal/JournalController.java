package arthur.controller.journal;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.JournalService;

@Controller
@RequestMapping("/arthur/journal") // 此控制其中的所有请求映射均要添加 前缀
public class JournalController {
	@Resource
	JournalService journalService;

	// 学生根据自己的id添加日志
	// 取(就是取dao层里面的参数)
	@RequestMapping(value = "/addJournal", method = RequestMethod.POST)
	public ModelAndView addJournal(Integer studentId, String journalContent) {
		// 调(就是调service服务层里面的方法)
		journalService.addJournal(studentId, journalContent);
		// 转(就是跳转到你的页面)
		return null;
	}

	// 学生根据自己的id去修改日志
	@RequestMapping(value = "/updateJournal", method = RequestMethod.POST)
	public ModelAndView updateJournal(Integer studentId, String journalContent) {
		journalService.updateJournal(studentId, journalContent);
		return null;
	}

	// 老师根据学生id去查看该学生的日志
	@RequestMapping(value = "/selectJournal", method = RequestMethod.POST)
	public ModelAndView selectJournal(Integer studentId) {
		journalService.selectJournal(studentId);
		return null;
	}
}
