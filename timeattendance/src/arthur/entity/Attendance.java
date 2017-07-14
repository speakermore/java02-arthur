package arthur.entity;

import java.sql.Timestamp;

/**
 * 考勤表
 * 
 * @auther 代益铨 2017年7月14日上午9:07:59
 */
public class Attendance {
	private Integer id;// 主键id
	private Timestamp studentSign;// 学生签到
	private Timestamp studentOut;// 学生签退
	private Integer studentId;// 学生表外键id

	public Attendance() {

	}

	public Attendance(Timestamp studentSign, Timestamp studentOut, Integer studentId) {
		super();
		this.studentSign = studentSign;
		this.studentOut = studentOut;
		this.studentId = studentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getStudentSign() {
		return studentSign;
	}

	public void setStudentSign(Timestamp studentSign) {
		this.studentSign = studentSign;
	}

	public Timestamp getStudentOut() {
		return studentOut;
	}

	public void setStudentOut(Timestamp studentOut) {
		this.studentOut = studentOut;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", studentSign=" + studentSign + ", studentOut=" + studentOut + ", studentId="
				+ studentId + "]";
	}

}
