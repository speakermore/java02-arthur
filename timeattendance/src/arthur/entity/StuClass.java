package arthur.entity;

import java.io.Serializable;

/**
 * 班级表
 * 
 * @auther 代益铨 2017年7月14日上午9:07:18
 */
public class StuClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4290302974439413484L;
	private Integer id;// 主键id
	private String className;// 班级名称

	public StuClass() {

	}

	public StuClass(String className) {
		super();
		this.className = className;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", className=" + className + "]";
	}

}
