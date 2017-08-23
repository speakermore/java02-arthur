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
	private String className;// 班级名称
	private Integer integralNum;// 积分
	private Integer fabulousNum;// 被点赞次数
	private Integer classId;// 班级表外键

	public Student() {

	}

	public Student(Integer id, String studentName, String studentPwd, String studentNo, String studentSex,
			String className, Integer integralNum, Integer fabulousNum, Integer classId) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentPwd = studentPwd;
		this.studentNo = studentNo;
		this.studentSex = studentSex;
		this.className = className;
		this.integralNum = integralNum;
		this.fabulousNum = fabulousNum;
		this.classId = classId;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getIntegralNum() {
		return integralNum;
	}

	public void setIntegralNum(Integer integralNum) {
		this.integralNum = integralNum;
	}

	public Integer getFabulousNum() {
		return fabulousNum;
	}

	public void setFabulousNum(Integer fabulousNum) {
		this.fabulousNum = fabulousNum;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

}