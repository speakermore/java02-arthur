package arthur.dao.journal;

import arthur.entity.Journal;
import arthur.entity.StuClass;
import arthur.entity.Student;

public interface JournalMapper {
	// 根据学生姓名、班级,查询该学生的日志
	public Integer addJournal(Journal journal, Student studentName, StuClass stuclass);
}
