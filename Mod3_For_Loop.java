package java_package_pro;

public class Mod3_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) One line 
		for (int i = 1; i < 11; i++)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		
		// 2) 
		String str = "name"; 
		for (int i = 1; i < 11; i+=2 )
		{
			System.out.println(str);
		}
	
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();		
		
		// 3)
		char star = '*';
		for (int i = 1; i < 16; i++)
		{
			System.out.print(star);
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		
		// 4)
		
//		for (int i = 0; i < last; i++)
//		{	if (i % 2 == 0 && i != 0 && i != last - 1)
//			{
//				System.out.print(i + ", ");
//			}
//			
//			else if (i % 2 == 0 && i != 0 && i == last - 1)
//			{
//				System.out.print(i);
//			}
//		}
//		
//		System.out.println();
		int last = 11;
		String odd = "";
		String even = "";
		for (int i = 1; i < last; i++)
		{	
			if (i % 2 == 0)
			{
				if (i < 10)
				{
					even += i + ", ";
				}
				else
				{
					even += i;
				}
			}
			else
			{
				odd += i + (i != last - 2? ", " : "");
			}	
		}
		
		System.out.println(odd);
		System.out.println(even);
		
/*		if (i % 2 == 0 && i != last - 1)
		{
			System.out.print(i + ", ");
		}
		else if (i % 2 == 1 && i == last - 1)
		{
			System.out.print(i);
		}
*/	
		//while loop 5)
		int i =1;
		int sum= 0;
		
		while(i<21) {
			sum+=i;
			i+=1; 
			
			
		}
		System.out.println("Sum of 1-20 "+ " = " +sum);
		
		int s = 0;
		while (s < 21) {
			s+=2
			System.out.print(s, ", ");	
			
		// Nested loop
			
			int p =0;
		       int num =0;
		       //Empty String
		       String  primeNumbers = "";

		       for (p = 1; p <= 21; p++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =p; num>=1; num--)
			  {
		             if(p%num==0)
			     {
		 		counter += 1;
			     }
			  }
			  if (counter ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + p + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 20 are :");
		       System.out.println(primeNumbers);

	}

}
