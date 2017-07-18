package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author QWF考勤实体类
 *
 *         2017年7月13日
 */
public class Attendance implements Serializable {

	private static final long serialVersionUID = -3282528170033137602L;
	private Integer id;// 主键id

	private Timestamp studentSign;// 学生签到
	private Timestamp studentOut;// 学生签退
	private Integer studentId;// 学生表外键id
	private String studentName;// 学生名字

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(Timestamp studentSign, Timestamp studentOut, Integer studentId, String studentName) {
		super();
		this.studentSign = studentSign;
		this.studentOut = studentOut;
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", studentSign=" + studentSign + ", studentOut=" + studentOut + ", studentId="
				+ studentId + ", studentName=" + studentName + "]";
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
