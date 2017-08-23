package arthur.entity;

import java.io.Serializable;

public class StuClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2772815306889401341L;
	private Integer id;// 主键id
	private String className;// 班级名称

	public StuClass() {

	}

	public StuClass(Integer id, String className) {
		super();
		this.id = id;
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

}
