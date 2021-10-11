package People;

public class Student extends Person{
	String s1, s2, s3;
	int school_id;
	
	// Empty constructor
	public Student() {
		
	}
	
	// Parameterized Constructor
	public Student(long ssn, String name, String dob, int age, String s1, String s2, String s3, int school_id ) {
		super(ssn, name, dob, age);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.school_id = school_id;
	}

	@Override
	public String toString() {
		return "Student [SSN: " + ssn + ", NAME: " + name + ", DOB: " + dob + ", AGE: " + age 
				+ ", SCHOOL ID: " + school_id + ", School: " + s1 + ", COURSE: " + s2 + ", COURSE: " + s3+  "]";
	}

	
	
}
