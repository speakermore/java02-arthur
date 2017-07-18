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

	private static final long serialVersionUID = -3138961070916355740L;
	private Integer id;// 学生密码
	private String studentName;// 学生姓名
	private String studentSex;// 学生性别
	private String studentNo;// 学生学号
	private String ClassId;// 班级id

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String studentSex, String studentNo, String classId) {
		super();
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.studentNo = studentNo;
		ClassId = classId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getClassId() {
		return ClassId;
	}

	public void setClassId(String classId) {
		ClassId = classId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentSex=" + studentSex + ", studentNo="
				+ studentNo + ", ClassId=" + ClassId + "]";
	}

}
