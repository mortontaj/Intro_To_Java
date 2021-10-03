package java_package_pro;
import java.util.*;

public class Mod3_Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
        System.out.print("Enter your grade: ");
        
        int grade = input.nextInt();
		if (grade > 89)
		{
			System.out.println("A");
		}
		else if (grade > 79)
		{
			System.out.println("B");
		}
		else if (grade > 69)
		{
			System.out.println("C");
		}
		else if (grade > 54)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}	
	
		System.out.println();
				
		System.out.println("Enter a number 1 - 7: ");
		int day = input.nextInt();
		switch(day) {
			case 1 :
				System.out.println("Monday");
				break;
			case 2 :
				System.out.println("Tuesday");
				break;
			case 3 :
				System.out.println("Wednesday");
				break;
			case 4 :
				System.out.println("Thursday");
				break;
			case 5 :
				System.out.println("Friday");
				break;
			case 6 :
				System.out.println("Saturday");
				break;
			case 7 :
				System.out.println("Sunday");
				break;
			default :
				System.out.println("Invalid Input");
		}
		
		System.out.println();
		System.out.println("Enter a number for your coolness: ");
		int num = input.nextInt();
		if (num % 2 == 0)
		{
			if (num > 1 && num < 6)
			{
				System.out.println("Not Cool");
			}
			else if (num > 5 && num < 21)
			{
				System.out.println("Cool");
			}
			else 
			{
				System.out.println("Not Cool");
			}
		}	
		else
		{
			System.out.println("Cool");
		}
			
		}
		
	}	

