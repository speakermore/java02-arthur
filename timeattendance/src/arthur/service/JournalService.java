package arthur.service;

import java.util.List;

import arthur.entity.Journal;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
public interface JournalService {
	// 学生根据自己的id添加日志
	public Integer addJournal(Integer studentId, String journalContent);

	// 学生根据自己的id修改日志
	public Integer updateJournal(Integer studentId, String journalContent);

	// 老师根据学生id去查看该学生的日志
	public List<Journal> selectJournal(Integer studentId);
}
