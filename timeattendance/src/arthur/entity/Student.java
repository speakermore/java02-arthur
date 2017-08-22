package arthur.entity;

import java.io.Serializable;

/**
 * 学生实体类
 * 
 * @author QWF
 *
 *         2017年7月13日
 */
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8438279057656017575L;
	private Integer id;// 主键id
	private String studentName;// 学生姓名
	private String studentPwd;// 学生密码
	private String studentNo;// 学生学号
	private String studentSex;// 学生性别
	private String stuClass;// 班级名称

	public Student() {
	}

	public Student(Integer id, String studentName, String studentPwd, String studentNo, String studentSex,
			String stuClass) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentPwd = studentPwd;
		this.studentNo = studentNo;
		this.studentSex = studentSex;
		this.stuClass = stuClass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPwd() {
		return studentPwd;
	}

	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

}