package arthur.controller.journal;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import arthur.service.JournalService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
@Controller
@RequestMapping("/arthur/journal")
public class JournalController {
	@Resource
	JournalService journalService;

	// 学生根据自己的id添加日志
	@RequestMapping(value = "/addJournal", method = RequestMethod.POST)
	public ModelAndView addJournal(Integer studentId, String journalContent) {
		journalService.addJournal(studentId, journalContent);
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
