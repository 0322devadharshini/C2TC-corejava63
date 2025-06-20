package day4;

public class StudentEntityClass {
    private String name;
    private int id;
	private static StudentEntityClass s1 = new StudentEntityClass();
	

	public static StudentEntityClass getS1() {
		return s1;
	}
	public static void setS1(StudentEntityClass s1) {
		StudentEntityClass.s1 = s1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentEntityClass [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
