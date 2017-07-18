package arthur.entity;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * 
 * @author QWF考勤实体类
 *
 *         2017年7月13日
 */
public class Attendance implements Serializable {
	private static final long serialVersionUID = -5049372448283749663L;
	private Integer id;// 考勤id
	private Timestamp studentSign;// 学生签到
	private Timestamp studentOut;// 学生签退
	private Integer studentId;// 学生id

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
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
