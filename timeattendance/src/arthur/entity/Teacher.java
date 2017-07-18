package arthur.entity;

import java.io.Serializable;

/**
 * 老师实体类
 * 
 * @author QWF
 *
 *         2017年7月13日
 */
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1957666182227796573L;
	private Integer id;// 老师id
	private String teacherName;// 老师姓名
	private String teacherPwd;// 老师登录密码

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPwd() {
		return teacherPwd;
	}

	public void setTeacherPwd(String teacherPwd) {
		this.teacherPwd = teacherPwd;
	}

	public Teacher(String teacherName, String teacherPwd) {
		super();
		this.teacherName = teacherName;
		this.teacherPwd = teacherPwd;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", teacherPwd=" + teacherPwd + "]";
	}

}
