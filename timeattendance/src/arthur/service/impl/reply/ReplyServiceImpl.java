package arthur.service.impl.reply;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.journal.JournalMapper;
import arthur.entity.Journal;
import arthur.service.JournalService;

@Service
public class ReplyServiceImpl implements JournalService {
	@Resource
	public JournalMapper journalMapper;

	@Override
	public Integer addJournal(Integer studentId) {
		// TODO Auto-generated method stub
		return journalMapper.addJournal(studentId);
	}

	@Override
	public Integer updateJournal(Integer studentId) {
		// TODO Auto-generated method stub
		return journalMapper.updateJournal(studentId);
	}

	@Override
	public List<Journal> selectJournal(Integer studentId) {
		// TODO Auto-generated method stub
		return journalMapper.selectJournal(studentId);
	}

}
