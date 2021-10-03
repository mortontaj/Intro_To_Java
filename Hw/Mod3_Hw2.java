package java_package_pro;
import java.util.Scanner;

public class Mod3_Hw2 {

	static void palindrome(String word_phrase) {
//		int wpLength = word_phrase.length();
//		String first_half = "";
//		String second_half = "";
//		for (int i = 0; i <= wpLength/2-1; i++)
//		{
//			first_half += word_phrase.charAt(i);
//		}
//		
//		for (int i = wpLength; i >= (wpLength)/2; i--)
//		{
//			second_half += word_phrase.charAt(i);
//		}
		String phrase_word = "";
		for (int i = word_phrase.length() - 1; i >= 0; i--)
		{
		phrase_word = phrase_word + word_phrase.charAt(i);
		}
		System.out.println(phrase_word);
		String statement2 = (word_phrase.equals(phrase_word) ? " is a palindrome!" : " is not an palindrome."); 
//		String statement2 = (first_half.toLowerCase() == second_half.toLowerCase()? " is a Palindrome!" : " is not a Palindrome.");
		System.out.println(word_phrase + statement2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
//	System.out.println("Enter start value of fibonacci Sn: ");
//	double start = Math.round(input.nextDouble());
//
//	System.out.println("Enter last value of Fibonacci Sn: ");
//	double end = Math.round(input.nextDouble());
//	
//	boolean YesFibonacci = true;
//	if (start < 0 || end <= 0 || start > end){
//		System.out.println(start + " and " + end +" Do not work. Use different inputs please.");
//		YesFibonacci = false;
//	}
//		
////	"""Return the `start to end` Fibonacci numbers for positive `start to end`."""
//	
//	
//	if (0 == start){
//		System.out.println(start + " position in Fibonacci sequence is " + start);
//	}
//
//	    int n_minus1 = 1;
//	    int n_minus2 = 0;
//	    int result = 0;
//
//	    if (YesFibonacci) {
//	    for (int i = 1; i <= end; i++) {
//	    	if (i == 1 && i >= start) {
//	    		System.out.println(i + " position in Fibonacci sequence is " + i);
//	    	}
//	    	else if (i >= start) {
//	        	System.out.println(i + " position in Fibonacci sequence is " + result);
//	        	}
//	        result = n_minus2 + n_minus1;
//	        n_minus2 = n_minus1;
//	        n_minus1 = result;
//	    }  
//	    }
//	System.out.println();
//	System.out.println();
//	System.out.println("Enter a three digit integer: ");
//	int armstrong = input.nextInt(); 	// I want to return this value [don't change it!]
//	int num = armstrong; 				// mutable number version of user input
//	int sum = 0; 						// running total to check if armstrong is naracissistic!
//	while (num > 0) {
//	    //System.out.println(num % 10); 	// shows the actual value to raise to the third power
//	    sum += (Math.pow(num % 10, 3)); // adds each value**3 
//	    num = num / 10; 				// sets up next value
//	}
//	String statement = (sum == armstrong? " is an armstrong naracissistic number!" : " is not an armstrong naracissistic number."); 
//	System.out.println(armstrong + statement);
//	System.out.println();
//	System.out.println();
	System.out.println("Enter a word or phrase to check if it's a palindrome: ");
	String word = input.nextLine();
	palindrome(word);
	
	} //closing class files
}
