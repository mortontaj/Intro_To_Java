package People;
import java.util.Scanner;

public class Person1 {
	//instance variables
	private long ssn;
	private String name;
	private String dob;
	private int age;
	
	// empty constructor
	private void Person1() {
			
	}
	
	// parameterized constructor
	private void Person1(long ssn, String name, String dob, int age){
		this.ssn = (long) Math.round(Math.random()*1000000 + ssn);
		this.name = name;
		this.dob = dob;
		this.age = age;
	}

	public void setSsn() {
		this.ssn = Math.round(Math.random() * 1000000000);
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
	
	@Override
	public String toString() {
		return name + " [SSN: " + (int) ssn + ", DOB: " + dob + ", Age: " + age + "]";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person1 human = new Person1();
		
		human.setSsn();
		//input.nextLine();
		System.out.println("Enter the student's name: ");
		String fname = input.nextLine();
		human.setName(fname);
		System.out.println("Enter student's DOB (i.e MM/DD/YYYY):");
		String dob = input.nextLine();
		human.setDob(dob);
		System.out.println("Enter student's age: ");
		int age = input.nextInt();
		human.setAge(age);
//		input.nextLine();
		System.out.println(human.toString());
		System.out.println(human.toString());
		System.out.println(human.toString());
		
		input.close();
	}
}