package arthur.dao.journal;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Journal;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
public interface JournalMapper {
	// 学生根据自己的id添加日志
	public Integer addJournal(@Param("studentId") Integer studentId, @Param("journalContent") String journalContent,
			@Param("journalTime") Timestamp journalTime);

	// 学生根据自己的id修改日志
	public Integer updateJournal(@Param("studentId") Integer studentId, @Param("journalContent") String journalContent);

	// 老师根据学生id去查看该学生的日志
	public List<Journal> selectJournal(@Param("studentId") Integer studentId);
}
