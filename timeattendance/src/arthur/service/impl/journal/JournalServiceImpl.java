package arthur.service.impl.journal;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.journal.JournalMapper;
import arthur.entity.Journal;
import arthur.service.JournalService;

@Service
public class JournalServiceImpl implements JournalService {
	
	@Resource
	public JournalMapper journalMapper;
	
	@Override
	public Integer addJournal(Integer studentId) {
		return journalMapper.addJournal(studentId);
	}

	@Override
	public Integer updateJournal(Integer studentId) {
		return journalMapper.updateJournal(studentId);
	}

	@Override
	public List<Journal> selectJournal(Integer studentId) {
		return journalMapper.selectJournal(studentId);
	}

}
