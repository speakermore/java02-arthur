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

	public Answer() {

	}

	public Answer(Integer questionId, String answerContent, Timestamp answerTime, Integer answerId) {
		super();
		this.questionId = questionId;
		this.answerContent = answerContent;
		this.answerTime = answerTime;
		this.answerId = answerId;
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

}
