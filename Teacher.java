package csc162;

public class Teacher {
	String designation = "Teacher";
	String collegeName = "California University";
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	void does() {
		System.out.println("Teaching");
	}
}
