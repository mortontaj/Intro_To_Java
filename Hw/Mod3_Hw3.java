package java_package_pro;
import java.util.Scanner;
 
public class Mod3_Hw3 {
	
	public static void calculator() {
	
	Scanner choice = new Scanner(System.in);
	double choosen = choice.nextDouble();
		
	switch ((int) choosen)
	{
	case 1:
		System.out.println("Adding");		
		System.out.println("What is your first value?");
		double a1 = choice.nextDouble();
		
		System.out.println("What is your second value?");
		double a2 = choice.nextDouble();	
		choice.close();
		double a3 = add(a1,a2);
		System.out.println(a3);// a3; 
		break;
	case 2:
		System.out.println("Subtracting");
		System.out.println("What is your first value?");
		double s1 = choice.nextDouble();
		
		System.out.println("What is your second value?");
		double s2 = choice.nextDouble();
		choice.close();
		double s3 = subtract(s1, s2);
		System.out.println(s3);
//		return s3;
		break;
	case 3:
		System.out.println("Multiplying");
		System.out.println("What is your first value?");
		choice.close();
		double m1 = choice.nextDouble();
		
		System.out.println("What is your second value?");
		double m2 = choice.nextDouble();
		choice.close();
		double m3 = multiply(m1, m2);
		System.out.println(m3);
//		return m3;
		break;
	case 4:
		System.out.println("Dividing");
		System.out.println("What is your first value?");
		double d1 = choice.nextDouble();
		
		System.out.println("What is your second value?");
		double d2 = choice.nextDouble();
		choice.close();
		double d3 = divide(d1, d2);
		System.out.println(d3);
//		return d3;
		break;
	default:
//		int state = 0;
		choice.close();
		System.out.println("Invalid choice");
		break;
//		return (double) state;
	}

	}
	
	public static double add(double first, double second)
	{
		return first+second;
	}
	
	public static double subtract(double first, double second)
	{
		return first-second;
	}
	
	public static double multiply(double first, double second)
	{
		return first*second;
	}
	
	public static double divide(double first, double second)
	{
		return first/second;
	}
	
	public static void display() {
		System.out.println("Enter a number 1-4");
		System.out.println("1 to Add");
		System.out.println("2 to Subtract");
		System.out.println("3 to Multiply");
		System.out.println("4 to Divide");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Scanner choice = new Scanner(System.in); 
	
//	boolean calculatorOn = true;
//	while (calculatorOn) { 
		display();
//		double z = 1.0;
		Mod3_Hw3.calculator();
		
//		System.out.println("Enter 'even number' to continue 'odd' to quit: ");
//		int power = input.nextInt();
//		if (power % 2 == 1)
//		{
//			calculatorOn = false;
//			break;
//		}
		
//	}
//	choice.close();
	}
	
}
