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
	private String studentPwd;// 学生密码
	private String studentName;// 学生姓名
	private String studentSex;// 学生性别
	private String studentNo;// 学生学号
	private Integer classId;// 班级表外键id
	private String stuClass;// 班级名称

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentPwd, String studentName, String studentSex, String studentNo, Integer classId,
			String stuClass) {
		super();
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.studentNo = studentNo;
		this.classId = classId;
		this.stuClass = stuClass;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
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

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentPwd=" + studentPwd + ", studentName=" + studentName + ", studentSex="
				+ studentSex + ", studentNo=" + studentNo + ", classId=" + classId + ", stuClass=" + stuClass + "]";
	}

}
