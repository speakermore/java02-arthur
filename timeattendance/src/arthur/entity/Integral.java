package arthur.entity;

import java.io.Serializable;

/**
 * 积分表
 * 
 * @auther 代益铨 2017年7月14日上午9:03:25
 */
public class Integral implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 364976714924682970L;
	private Integer id;// 主键id
	private Integer integralNum;// 积分总数
	private Integer studentId;// 学生表外键id
	private Integer giftPoints;// 赠送积分

	public Integral() {

	}

	public Integral(Integer integralNum, Integer studentId, Integer giftPoints) {
		super();
		this.integralNum = integralNum;
		this.studentId = studentId;
		this.giftPoints = giftPoints;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntegralNum() {
		return integralNum;
	}

	public void setIntegralNum(Integer integralNum) {
		this.integralNum = integralNum;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getGiftPoints() {
		return giftPoints;
	}

	public void setGiftPoints(Integer giftPoints) {
		this.giftPoints = giftPoints;
	}

	@Override
	public String toString() {
		return "Integral [id=" + id + ", integralNum=" + integralNum + ", studentId=" + studentId + ", giftPoints="
				+ giftPoints + "]";
	}

}
