package People;

public class Person {
	//instance variables
	long ssn;
	String name;
	String dob;
	int age;
	
	// empty constructor
	public Person() {
		
	}
	
	// parameterized constructor
	public Person(long ssn, String name, String dob, int age){
		this.ssn = (long) Math.round(Math.random()*1000000 + ssn);
		this.name = name;
		this.dob = dob;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn() {
		this.ssn = (long) Math.round(Math.random()*1000000);
	}

	@Override
	public String toString() {
		return "Person [SSN: " + ssn + ", NAME: " + name + ", DOB: " + dob + ", AGE: " + age + "]";
	}

}
