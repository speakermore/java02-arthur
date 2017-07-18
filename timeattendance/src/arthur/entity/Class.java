package arthur.entity;

import java.io.Serializable;

/**
 * 班级实体类
 * 
 * @author QWF
 *
 *         2017年7月13日
 */
public class Class implements Serializable {
	private static final long serialVersionUID = -6343630458043674687L;
	private Integer id;// 班级id
	private String className;// 班级名称

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(String className) {
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
