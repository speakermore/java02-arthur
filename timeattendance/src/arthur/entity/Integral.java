package arthur.entity;

import java.io.Serializable;

/**
 * 
 * @author QWF积分表实体类
 *
 *         2017年7月13日
 */
public class Integral implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 364976714924682970L;
	private Integer id;// 主键id
	private Integer integralNum;// 积分总数
	private Integer giftPoints;// 积分赠送
	private Integer studentid;// 学生id

	public Integral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integral(Integer integralNum, Integer giftPoints, Integer studentid) {
		super();
		this.integralNum = integralNum;
		this.giftPoints = giftPoints;
		this.studentid = studentid;
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

	public Integer getGiftPoints() {
		return giftPoints;
	}

	public void setGiftPoints(Integer giftPoints) {
		this.giftPoints = giftPoints;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	@Override
	public String toString() {
		return "Integral [id=" + id + ", integralNum=" + integralNum + ", giftPoints=" + giftPoints + ", studentid="
				+ studentid + "]";
	}

}
