package arthur.controller.journal;

import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arthur.entity.Journal;
import arthur.entity.Student;
import arthur.service.JournalService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
@Controller
@RequestMapping("arthur/journal")
public class JournalController {
	@Resource
	JournalService journalService;

	// 学生添加日志
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String loing() {
		return "/student";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String addJournal(Journal journal, Model model, HttpSession session) {
		// Student stu = (Student) session.getAttribute("user");
		// journal.setStudentId(stu.getId());
		journal.setJournalTime(new Timestamp(System.currentTimeMillis()));
		journal.setStuClass(((Student) session.getAttribute("user")).getStuClass());
		journal.setStudentName(((Student) session.getAttribute("user")).getStudentName());
		journalService.addJournal(journal);
		model.addAttribute("success", "添加成功!");
		return "/student";
	}

	// 学生添加日志
	// @RequestMapping(value = "/addJournal", method = RequestMethod.POST)
	// public ModelAndView addJournal(Integer studentId, String journalContent)
	// {
	// journalService.addJournal(studentId, journalContent);
	// return null;
	// }
	//
	// // 学生根据自己的id去修改日志
	// @RequestMapping(value = "/updateJournal", method = RequestMethod.POST)
	// public ModelAndView updateJournal(Integer studentId, String
	// journalContent) {
	// journalService.updateJournal(studentId, journalContent);
	// return null;
	// }
	//

	// // 老师根据学生id去查看该学生的日志
	// @RequestMapping(value = "/selectJournal", method = RequestMethod.POST)
	// public ModelAndView selectJournal(Integer studentId) {
	// journalService.selectJournal(studentId);
	// return null;
	// }
}
