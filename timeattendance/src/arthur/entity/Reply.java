package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 答复表
 * 
 * @auther 代益铨 2017年7月14日上午9:04:41
 */
public class Reply implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6239655557553344306L;
	private Integer id;// 主键id
	private String answer;// 回答问题
	private String help;// 提问问题或求助
	private Timestamp answerTime;// 回答问题时间
	private Timestamp helpTime;// 提问问题或求助时间
	private Integer helpId;// 提问者的id

	public Reply() {

	}

	public Reply(String answer, String help, Timestamp answerTime, Timestamp helpTime, Integer helpId) {
		super();
		this.answer = answer;
		this.help = help;
		this.answerTime = answerTime;
		this.helpTime = helpTime;
		this.helpId = helpId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public Timestamp getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Timestamp answerTime) {
		this.answerTime = answerTime;
	}

	public Timestamp getHelpTime() {
		return helpTime;
	}

	public void setHelpTime(Timestamp helpTime) {
		this.helpTime = helpTime;
	}

	public Integer getHelpId() {
		return helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", answer=" + answer + ", help=" + help + ", answerTime=" + answerTime
				+ ", helpTime=" + helpTime + ", helpId=" + helpId + "]";
	}

}
