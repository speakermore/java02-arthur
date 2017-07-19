package arthur.service.impl.journal;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import arthur.dao.journal.JournalMapper;
import arthur.entity.Journal;
import arthur.service.JournalService;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
@Service
public class JournalServiceImpl implements JournalService {

	@Resource
	public JournalMapper journalMapper;

	@Override
	public Integer addJournal(Integer studentId, String journalContent) {
		return journalMapper.addJournal(studentId, journalContent, new Timestamp(System.currentTimeMillis()));
	}

	@Override
	public Integer updateJournal(Integer studentId, String journalContent) {
		return journalMapper.updateJournal(studentId, journalContent);
	}

	@Override
	public List<Journal> selectJournal(Integer studentId) {
		return journalMapper.selectJournal(studentId);
	}

}
