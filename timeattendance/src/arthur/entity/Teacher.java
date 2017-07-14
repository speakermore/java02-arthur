package arthur.entity;

/**
 * 老师表
 * 
 * @auther 代益铨 2017年7月14日上午9:10:03
 */
public class Teacher {
	private Integer id;// 主键id
	private String teacherName;// 老师姓名
	private String teacherPwd;// 老师密码

	public Teacher() {

	}

	public Teacher(String teacherName, String teacherPwd) {
		super();
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

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", teacherPwd=" + teacherPwd + "]";
	}

}
