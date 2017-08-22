package arthur.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author QWF点赞表实体类
 *
 *         2017年7月13日
 */
public class Fabulous implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 82743286097076518L;
	private Integer id;// 主键id
	private Integer studentId;// 学生表外键id
	private String studentName;// 被点赞的学生
	private Timestamp fabulousTime;// 点赞的时间
	private String fabulousName;// 点赞学生

	public Fabulous() {

	}

	public Fabulous(Integer id, Integer studentId, String studentName, Timestamp fabulousTime, String fabulousName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fabulousTime = fabulousTime;
		this.fabulousName = fabulousName;
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

}
