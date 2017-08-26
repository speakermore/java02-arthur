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
	private Integer id;// 主键id
	private Integer studentId;// 学生表外键id
	private String questionContent;// 提问内容
	private Timestamp questionTime;// 提问时间
	private Integer questionGiveIntegral;// 奖励积分
	private String studentName;// 学生姓名
	private String className;// 班级名称
	private Integer answerId;// 回答者的id
	/*
	 * private String answerContent;// 回答内容 private Timestamp answerTime;// 回答时间
	 * private String ansName;// 回答者的名字
	 */

	public Question() {

	}

	public Question(Integer id, Integer studentId, String questionContent, Timestamp questionTime,
			Integer questionGiveIntegral, String studentName, String className, Integer answerId) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.questionContent = questionContent;
		this.questionTime = questionTime;
		this.questionGiveIntegral = questionGiveIntegral;
		this.studentName = studentName;
		this.className = className;
		this.answerId = answerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

}
