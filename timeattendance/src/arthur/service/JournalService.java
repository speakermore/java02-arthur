package arthur.service;

import java.util.List;

import arthur.entity.Journal;

public interface JournalService {
	// 学生根据自己的id添加日志
	public Integer addJournal(Integer studentId);

	// 学生根据自己的id修改日志
	public Integer updateJournal(Integer studentId);

	// 老师根据学生id去查看该学生的日志
	public List<Journal> selectJournal(Integer studentId);
}
