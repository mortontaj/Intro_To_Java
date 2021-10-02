package java_package_pro;
import java.util.Scanner;

public class For_Loop_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input= new Scanner(System.in);
	System.out.println("Enter a number any number for it's 1 - 15 product: ");
	int value = input.nextInt();
	for (int i = 1; i < 16; i++)
	{
		System.out.println(value * i);
	}
		
	}

}
