package arthur.entity;

/**
 * 点赞表
 * 
 * @auther 代益铨 2017年7月14日上午9:02:12
 */
public class Fabulous {
	private Integer id;// 主键id
	private Integer studentId;// 学生表外键id
	private Integer fabulousNum;// 点赞次数

	public Fabulous() {

	}

	public Fabulous(Integer studentId, Integer fabulousNum) {
		super();
		this.studentId = studentId;
		this.fabulousNum = fabulousNum;
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

	public Integer getFabulousNum() {
		return fabulousNum;
	}

	public void setFabulousNum(Integer fabulousNum) {
		this.fabulousNum = fabulousNum;
	}

	@Override
	public String toString() {
		return "Fabulous [id=" + id + ", studentId=" + studentId + ", fabulousNum=" + fabulousNum + "]";
	}

}
