package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 日志表
 * 
 * @auther 代益铨 2017年7月14日上午9:06:17
 */
public class Journal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4577994980165302051L;
	private Integer id;// 主键id
	private String journalContent;// 日志内容
	private Timestamp journalTime;// 发表日志时间
	private Integer studentId;// 学生表外键id
	private String studentName;// 学生姓名
	private String stuClass;// 班级

	public Journal() {

	}

	public Journal(String journalContent, Timestamp journalTime, Integer studentId, String studentName,
			String stuClass) {
		super();
		this.journalContent = journalContent;
		this.journalTime = journalTime;
		this.studentId = studentId;
		this.studentName = studentName;
		this.stuClass = stuClass;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
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
				+ ", studentId=" + studentId + ", studentName=" + studentName + ", stuClass=" + stuClass + "]";
	}

}
