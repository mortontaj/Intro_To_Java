package People;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.LinkedList;

public class Main implements PersonInterface {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in); 
		
		System.out.println(ORGINIZATION);
		// stockPrice(int 4);
		
		
//		System.out.println("Press Enter, Type student's SSN, Press Enter again: ");
//		double student_ssn = input1.nextDouble();
//		input1.nextLine();
//		System.out.println("Enter the student's name: ");
//		String fname = input1.nextLine();
//		System.out.println("Enter student's DOB (i.e MM/DD/YYYY):");
//		String student_dob = input1.nextLine();
//		System.out.println("Enter student's age: ");
//		int student_age = input1.nextInt();
//		input1.nextLine();
//		System.out.println("Enter student's School: ");
//		String student_cs1 = input1.nextLine();
//		System.out.println("Enter student's second course: ");
//		String student_cs2 = input1.nextLine();
//		System.out.println("Enter student's third course: ");
//		String student_cs3 = input1.nextLine();
//		System.out.println("Enter student's ID: ");
//		int student_id = input1.nextInt();
//		input1.nextLine();
		
//		Student freshman = new Student(student_ssn, fname, student_dob, student_age, student_cs1, student_cs2, student_cs3, student_id);
//		System.out.println(freshman.toString());

//		double ssn, String name, String dob, int age, long emp_id, double salary, String title, String parkingSpot

		Employee vp = new Employee();
		
		vp.setSsn();
		System.out.println("Enter Employee Name: ");
		String EMPLOYEE_Name = input1.nextLine(); 
		vp.setName(EMPLOYEE_Name);
		System.out.println("Enter Employee's DOB (i.e MM/DD/YYYY):");
		String EMPLOYEE_DOB = input1.nextLine();
		vp.setDob(EMPLOYEE_DOB);
		System.out.println("Enter Employee's age: ");
		int EMPLOYEE_Age = input1.nextInt();
		input1.nextLine();
		vp.setAge(EMPLOYEE_Age);
		vp.setEmp_id();
		System.out.println("Enter Employee's Salary: ");
		double EMPLOYEE_Salary = input1.nextDouble();
		input1.nextLine();
		vp.setSalary(EMPLOYEE_Salary);
		System.out.println("Enter Employee's Position: ");
		String EMPLOYEE_Title = input1.nextLine(); 
		vp.setTitle(EMPLOYEE_Title);
		System.out.println("Enter Employee's Parking Spot: ");
		String EMPLOYEE_Parking = input1.nextLine(); 
		vp.setParkingSpot(EMPLOYEE_Parking);
		
		System.out.println(vp.toString());
		input1.close();
	}
}


/*		LinkedList <String> learner = new LinkedList<String>();
		LinkedList <String> learner_numbers = new LinkedList<String>();
		ArrayList <String> fetched = new ArrayList<String>();
		ArrayList <String> fetched_numbers = new ArrayList<String>();
*/

/*		String student_name = "Enter the student's name: ";
		String student_dob = "Enter student's DOB (i.e MM/DD/YYYY): ";
		String student_age = "Enter student's age: "; //
		String student_cs1 = "Enter student's first course: ";
		String student_cs2 = "Enter student's second course: ";
		String student_cs3 = "Enter student's third course: ";
		String student_id = "Enter student's ID: "; //
		
		learner.add(student_name);
		learner.add(student_dob);
		learner.add(student_cs1);
		learner.add(student_cs2); 
		learner.add(student_cs3);		
		
		learner_numbers.add(student_age);
		learner_numbers.add(student_id);
		
		learner.toArray();
		learner_numbers.toArray();
		
		for (String i : learner) {
			System.out.println(i);
			String fetch = input.nextLine();
			fetched.add(fetch);
		}
		
		for (String i : learner_numbers) {
			System.out.println(i);
			String fetch_numbers = input.nextLine();
			fetched_numbers.add(fetch_numbers);
		}
*/		
		
		


