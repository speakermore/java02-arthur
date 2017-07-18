package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author QWF 答复表实体类
 *
 *         2017年7月13日
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
	private String helpName;// 提问者的id
	private String studentName;// 回答问题的学生名字
	private String teacherName;// 回答问题的老师名字

	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reply(String answer, String help, Timestamp answerTime, Timestamp helpTime, String helpName,
			String studentName, String teacherName) {
		super();
		this.answer = answer;
		this.help = help;
		this.helpTime = helpTime;
		this.helpName = helpName;
		this.studentName = studentName;
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", answer=" + answer + ", help=" + help + ", answerTime=" + answerTime
				+ ", helpTime=" + helpTime + ", helpName=" + helpName + ", studentName=" + studentName
				+ ", teacherName=" + teacherName + "]";
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

	public String getHelpName() {
		return helpName;
	}

	public void setHelpName(String helpName) {
		this.helpName = helpName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
