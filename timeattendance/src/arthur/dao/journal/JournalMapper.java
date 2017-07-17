package arthur.dao.journal;

import org.apache.ibatis.annotations.Param;

import arthur.entity.Journal;
import arthur.entity.StuClass;
import arthur.entity.Student;

public interface JournalMapper {
	// 根据学生姓名、班级,查询该学生的日志
	public Integer addJournal(@Param("journal") Journal journal, @Param("studentName") Student studentName,
			@Param("stuclass") StuClass stuclass);
}
