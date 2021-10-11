package People;

public class Employee extends Person{
	long emp_id;
	double salary;
	String title;
	String parkingSpot;
	
	// Empty
	public Employee() {
		
	}
	
	// Parameterized 
	public Employee(long ssn, String name, String dob, int age, long emp_id, double salary, String title, String parkingSpot) {
		super(ssn, name, dob, age);
		this.emp_id = emp_id;
		this.salary = salary;
		this.title = title;
		this.parkingSpot = parkingSpot;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id() {
		this.emp_id = (long) Math.round(Math.random() * 10000) ;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(String parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	@Override
	public String toString() {
		return "Employee [SSN: " + ssn + ", NAME: " + name + ", DOB: " + dob + ", AGE: " + age + ", EMPLOYEE ID: "
				+ emp_id + ", SALARY: " + salary + ", TITLE: " + title + ", PARKING SPOT: " + parkingSpot + "]";
	}
	
	
}
