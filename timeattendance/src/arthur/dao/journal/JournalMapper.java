package arthur.dao.journal;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Journal;

public interface JournalMapper {
	// 学生根据自己的id添加日志
	public Integer addJournal(@Param("studentId") Integer studentId);

	// 学生根据自己的id修改日志
	public Integer updateJournal(@Param("studentId") Integer studentId);

	// 老师根据学生id去查看该学生的日志
	public List<Journal> selectJournal(@Param("studentId") Integer studentId);
}
