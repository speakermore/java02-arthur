package arthur.dao.journal;

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
	// 学生添加日志
	public Integer addJournal(Journal journal);

	// 老师查看学生日志
	public List<Journal> findAllJournal(@Param("stuName") String stuName, @Param("stuClass") String stuClass);
}
