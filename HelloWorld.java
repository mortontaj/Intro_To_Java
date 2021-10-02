package java_package_pro;
//import java.nio.file.FileSystem;
import java.util.*;  

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		
		float fnum = 10.34f;
        System.out.println(fnum);

        int numbera = 5;
        int numberb = 6;
        int numberc = 7;
        
        // 1)
        // Add Subtract mulitpy Divide Remainder
        System.out.println("add: Sum of 5 and 7 is " + (numbera + numberc));
        System.out.println("subtract: Difference of 6 and 7 is " + (numberb - numberc));
        System.out.println("multiply: product of 5 and 6 is " + (numbera * numberb));
        System.out.println("divide: quotient of 6 and 3 is " + (numberb / 3));
        System.out.println("divide: quotient's remainder of 20 and 3 is " + (20 % 3));

        // 2) Swap variables display before and after change
        // Before swap
        // set a = 100, b = 150, c = 50
        int a, b, c, a_temp, b_temp;
        a = 100;
        b = 150;
        c = 50;
        System.out.println("Before swapping: Numbera= " + a + " Numberb = " + b + " Numberc = " + c);
        // After swap
        // assign a = 50, b = 100, c = 150
        a_temp = a;
        b_temp = b;
        a = c;
        b = a_temp;
        c = b_temp;
        System.out.println("After swapping: Numbera = " + a + " Numberb = " + b + " Numberc = " + c);

        // 3) Avg
        // display mean of five variable
        int score1, score2, score3, score4, score5;
        score1 = 100;
        score2 = 103;
        score3 = 86;
        score4 = 60;
        score5 = 79;
        System.out.println((score1 + score2 + score3 + score4 + score5)/5);
    
        // 4) Show larger of 2 numbers
        int j, k;
        k = 10;
        j = 10;
        // j = 2;
        if (j > k)
            System.out.println("j = " + j + " is larger!");
        else if (j < k)
            System.out.println("k = " + k + " is larger!");
        else
            System.out.println("j and k are equal. And they each equal " + j + "!");    
        
        // 5) Show largest of 3 numbers
        int d, e, f;
        d = 10;
        e = 6;
        f = 2;
        if (d == e && d == f)
            System.out.println("d, e, f are equal. And they each equal " + d + "!");
        else if (d == e && e > f)
            System.out.println("d and e are equal. They are the larger than f. They each equal " + d + "!");
        else if (e == f && f > d)
            System.out.println("e and f are equal. They are the larger than d. They each equal " + e + "!");
        else if (f == d && d > e)
            System.out.println("f and d are equal. They are the larger than e. They each equal " + f + "!");
        else if (f > e && f > d)
            System.out.println("f is the largest. f equals " + f + "!");    
        else if (e > d && e > f)
            System.out.println("e is the largest. e equals " + e + "!");    
        else //if (d > f && d > e)
            System.out.println("d is the largest. d equals " + d + "!");    

        // 6)
        // determine if number is positive negative or zero
        int r;
        // r = -2;
        // r = 0;
        r = 4;
        if (r > 0)
            System.out.println("r is positive because " + r + " is greater than 0!");
        else if (r < 0)
            System.out.println("r is negative because " + r + " is less than 0!");
        else
            System.out.println("r equals " + r + "!");

        // 7)
        // determine if number is even or odd
        int u;
        // u = 10;
        u = 17;
        if (u % 2 == 1)
            System.out.println("u = " + u + " and it is odd!");
        else
            System.out.println("u = " + u + " and it is even!");

        // 8)
        // determine if person input age (years) is eligible to vote
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= input.nextInt();
        if (age >= 18)
            System.out.println("You are " + age + " years old! You may vote.");
        else
            System.out.println("Sorry you have to wait " + (18 - age) + " year(s) to vote!");
	}

}
