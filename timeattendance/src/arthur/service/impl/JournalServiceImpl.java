package arthur.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.JournalMapper;
import arthur.entity.Journal;
import arthur.service.JournalService;

/**
 * 
 * @auther 代益铨 2017年8月28日下午4:31:15
 */
@Service
public class JournalServiceImpl implements JournalService {
	@Resource
	private JournalMapper journalMapper;

	@Override
	public Integer addJournal(Journal journal) {
		return journalMapper.addJournal(journal);
	}

	@Override
	public List<Journal> findAll(Integer studentId) {
		return journalMapper.findAll(studentId);
	}

	@Override
	public Journal findByJournalId(Integer journalId) {
		return journalMapper.findByJournalId(journalId);
	}

	@Override
	public Integer updateJournalContent(Integer id, String journalContent) {
		return journalMapper.updateJournalContent(id, journalContent);
	}

}
