package arthur.entity;
/**
 * 日志实体类
 * @author QWF
 *
 * 2017年7月13日
 */

import java.io.Serializable;
import java.security.Timestamp;

public class Journal implements Serializable {

	private static final long serialVersionUID = 6797434549304546485L;
	private Integer id;// 日志id
	private String journalContent;// 日志内容
	private Timestamp journalTime;// 发表日志时间
	private Integer studentId;// 学生id

	public Journal() {
		super();
		// TODO Auto-generated constructor stub
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
