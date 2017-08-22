package arthur.entity;

public class StuClass {
	private Integer id;
	private String className;

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
