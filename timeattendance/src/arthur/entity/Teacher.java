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
	/**
	 * 
	 */
	private static final long serialVersionUID = 6380880034347369203L;
	private Integer id;// 主键id
	private String teacherName;// 老师姓名
	private String teacherPwd;// 老师登录密码

	public Teacher() {
	}

	public Teacher(Integer id, String teacherName, String teacherPwd) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.teacherPwd = teacherPwd;
	}

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

}
