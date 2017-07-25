package arthur.entity;

import java.sql.Timestamp;

/**
 * 答复表
 * 
 * @auther 代益铨 2017年7月24日上午9:23:13
 */
public class Answer {
	private Integer id;
	private Integer questionId;
	private String answerContent;
	private Timestamp answerTime;
	private Integer answerId;

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

	@Override
	public String toString() {
		return "Answer [id=" + id + ", questionId=" + questionId + ", answerContent=" + answerContent + ", answerTime="
				+ answerTime + ", answerId=" + answerId + "]";
	}

}
