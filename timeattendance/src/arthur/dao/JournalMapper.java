package arthur.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Journal;

/**
 * 
 * @auther 代益铨 2017年8月30日上午11:41:41
 */
public interface JournalMapper {
	// 学生填写日志
	Integer addJournal(Journal journal);

	// 查询自己所有的日志信息
	List<Journal> findAll(@Param("studentId") Integer studentId);

	// 根据journalId查询自己的单条日志内容
	Journal findByJournalId(@Param("journalId") Integer journalId);

	// 点击修改后根据日志的id去修改内容
	Integer updateJournalContent(@Param("id") Integer id, @Param("journalContent") String journalContent);
}
