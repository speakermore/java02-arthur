package arthur.dao.journal;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Journal;

/**
 * 
 * @author 钱文飞
 *
 *         2017年7月19日
 */
public interface JournalMapper {
	// 学生添加日志
	public Integer addJournal(Journal journal);

	// 学生修改日志
	public Integer updateJournal(@Param("journalContent") String journalContent, Integer id);

}
