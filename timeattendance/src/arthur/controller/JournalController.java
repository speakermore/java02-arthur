package arthur.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import arthur.entity.Journal;
import arthur.service.JournalService;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:43:51
 */
@Controller
@RequestMapping(value = "/journal")
public class JournalController {
	@Resource
	JournalService journalService;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String see(@RequestParam("journalId") Integer journalId, Model model) {
		Journal jour = journalService.findByJournalId(journalId);
		model.addAttribute("jou", jour);
		return "updatejournal";
	}

	// 点击修改后根据日志的id去修改内容
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestParam("id") Integer id, @RequestParam("journalContent") String journalContent,
			Model model) {
		journalService.updateJournalContent(id, journalContent);
		model.addAttribute("journal", "修改成功!");
		return "updatejournal";
	}

}
