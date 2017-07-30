package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 提问表
 * 
 * @auther 代益铨 2017年7月24日上午9:23:04
 */
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6724859136726367123L;
	private Integer id;
	private Integer studentId;
	private String questionContent;
	private Timestamp questionTime;
	private Integer questionGiveIntegral;
	private String studentName;

	public Question() {
	}

	public Question(Integer studentId, String questionContent, Timestamp questionTime, Integer questionGiveIntegral) {
		super();
		this.studentId = studentId;
		this.questionContent = questionContent;
		this.questionTime = questionTime;
		this.questionGiveIntegral = questionGiveIntegral;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public Timestamp getQuestionTime() {
		return questionTime;
	}

	public void setQuestionTime(Timestamp questionTime) {
		this.questionTime = questionTime;
	}

	public Integer getQuestionGiveIntegral() {
		return questionGiveIntegral;
	}

	public void setQuestionGiveIntegral(Integer questionGiveIntegral) {
		this.questionGiveIntegral = questionGiveIntegral;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", studentId=" + studentId + ", questionContent=" + questionContent
				+ ", questionTime=" + questionTime + ", questionGiveIntegral=" + questionGiveIntegral + "]";
	}

}
