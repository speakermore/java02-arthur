package arthur.entity;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * 
 * @author QWF 答复表实体类
 *
 *         2017年7月13日
 */
public class Reply implements Serializable {

	private static final long serialVersionUID = -3054483775839243054L;
	private Integer id;// 答复表id
	private String answer;// 问题的答案
	private String help;// 问题
	private Timestamp helpTime;// 提问的时间
	private Timestamp answerTimes;// 回答问题的时间

	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reply(String answer, String help, Timestamp helpTime, Timestamp answerTimes) {
		super();
		this.answer = answer;
		this.help = help;
		this.helpTime = helpTime;
		this.answerTimes = answerTimes;
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

	public Timestamp getHelpTime() {
		return helpTime;
	}

	public void setHelpTime(Timestamp helpTime) {
		this.helpTime = helpTime;
	}

	public Timestamp getAnswerTimes() {
		return answerTimes;
	}

	public void setAnswerTimes(Timestamp answerTimes) {
		this.answerTimes = answerTimes;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", answer=" + answer + ", help=" + help + ", helpTime=" + helpTime + ", answerTimes="
				+ answerTimes + "]";
	}

}
