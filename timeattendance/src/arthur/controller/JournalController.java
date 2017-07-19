package arthur.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import arthur.service.JournalService;

@Controller
@RequestMapping("") // 此控制其中的所有请求映射均要添加 前缀
public class JournalController {
	@Resource
	JournalService journalService;
	
	public ()

}
