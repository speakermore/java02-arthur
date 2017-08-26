package arthur.entity;

import java.sql.Timestamp;

/**
 * 答复表
 * 
 * @auther 代益铨 2017年7月24日上午9:23:13
 */
public class Answer {
	private Integer id;// 主键id
	private Integer questionId;// 提问者的id
	private String answerContent;// 回答内容
	private Timestamp answerTime;// 回答内容
	private Integer answerId;// 回答者的id
	private Integer studentId;// 学生表外键id
	private String questionContent;// 提问内容
	private Timestamp questionTime;// 提问时间
	private Integer questionGiveIntegral;// 奖励积分

	public Answer() {

	}

	public Answer(Integer id, Integer questionId, String answerContent, Timestamp answerTime, Integer answerId,
			Integer studentId, String questionContent, Timestamp questionTime, Integer questionGiveIntegral) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.answerContent = answerContent;
		this.answerTime = answerTime;
		this.answerId = answerId;
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

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public Timestamp getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Timestamp answerTime) {
		this.answerTime = answerTime;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
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

}
