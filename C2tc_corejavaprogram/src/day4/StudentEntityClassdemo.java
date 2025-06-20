package day4;

public class StudentEntityClassdemo {

	public static void main(String[] args) {
		StudentEntityClass st=StudentEntityClass.getS1();
		st.setId(0322);
		st.setName("Dharshini");
		
		StudentEntityClass st1=StudentEntityClass.getS1();
		System.out.println(st1);
		System.out.println(st);
	}

}
