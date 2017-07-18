package arthur.entity;

import java.security.Timestamp;

/**
 * 
 * @author QWF点赞表实体类
 *
 *         2017年7月13日
 */
public class Fabulous {
	private Integer id;// 点赞表
	private Integer studentId;// 学生外键id
	private Timestamp fabulousTime;// 点赞时间
	private String fabulousName;// 点赞学生
	private String studentName;// 被点赞的学生

	public Fabulous() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fabulous(Integer studentId, Timestamp fabulousTime, String fabulousName, String studentName) {
		super();
		this.studentId = studentId;
		this.fabulousTime = fabulousTime;
		this.fabulousName = fabulousName;
		this.studentName = studentName;
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

	public Timestamp getFabulousTime() {
		return fabulousTime;
	}

	public void setFabulousTime(Timestamp fabulousTime) {
		this.fabulousTime = fabulousTime;
	}

	public String getFabulousName() {
		return fabulousName;
	}

	public void setFabulousName(String fabulousName) {
		this.fabulousName = fabulousName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Fabulous [id=" + id + ", studentId=" + studentId + ", fabulousTime=" + fabulousTime + ", fabulousName="
				+ fabulousName + ", studentName=" + studentName + "]";
	}

}
