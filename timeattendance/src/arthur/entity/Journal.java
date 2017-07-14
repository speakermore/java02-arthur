package arthur.entity;

import java.sql.Timestamp;

/**
 * 日志表
 * 
 * @auther 代益铨 2017年7月14日上午9:06:17
 */
public class Journal {
	private Integer id;// 主键id
	private String journalContent;// 日志内容
	private Timestamp journalTime;// 发表日志时间
	private Integer studentId;// 学生表外键id

	public Journal() {

	}

	public Journal(String journalContent, Timestamp journalTime, Integer studentId) {
		super();
		this.journalContent = journalContent;
		this.journalTime = journalTime;
		this.studentId = studentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJournalContent() {
		return journalContent;
	}

	public void setJournalContent(String journalContent) {
		this.journalContent = journalContent;
	}

	public Timestamp getJournalTime() {
		return journalTime;
	}

	public void setJournalTime(Timestamp journalTime) {
		this.journalTime = journalTime;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Journal [id=" + id + ", journalContent=" + journalContent + ", journalTime=" + journalTime
				+ ", studentId=" + studentId + "]";
	}

}
