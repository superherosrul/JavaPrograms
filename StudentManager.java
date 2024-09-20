package csc162;

public class StudentManager {
	
	public StudentManager find(String studentID) throws StudentNotFoundException {
		
		if (studentID.equals("123456")) {
			System.out.println("Student has been found " + studentID);
			return new StudentManager();
		}
		else {
			throw new StudentNotFoundException("Could not find student with ID " + studentID);
		}
	}
}
