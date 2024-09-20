package csc162;

public class StudentTest {

	public static void main(String[] args) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
		
		StudentManager student = new StudentManager();
		student.find("123456");
		student.find("123556");
	}

}
