package arthur.entity;

/**
 * 学生表
 * 
 * @auther 代益铨 2017年7月14日上午9:10:54
 */
public class Student {
	private Integer id;// 主键id
	private String studentPwd;// 学生密码
	private String studentName;// 学生姓名
	private String studentSex;// 学生性别
	private String studentNo;// 学生学号
	private Integer classId;// 班级表外键id

	public Student() {

	}

	public Student(String studentPwd, String studentName, String studentSex, String studentNo, Integer classId) {
		super();
		this.studentPwd = studentPwd;
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.studentNo = studentNo;
		this.classId = classId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentPwd() {
		return studentPwd;
	}

	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
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
				+ studentSex + ", studentNo=" + studentNo + ", classId=" + classId + "]";
	}

}
