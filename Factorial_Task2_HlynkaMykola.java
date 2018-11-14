/*

*******************************Task 2: The Factorial**************************
Given the value of n! (n! = 1 * 2 * ... * (n - 1) * n). Find the value of n.

Input
The value of n! (1 ≤ n ≤ 2000).

Output
Print the value of positive integer n.

Input example #1
5040

Output example #1
7
*/
// JAVA program to compute factorial  
// of large numbers 

import java.util.Scanner;
class LargeFactorial { 
      
    // This function finds factorial of  
    // large numbers and prints them
	static String text1 = "";//for input value of Factorial
	static String resultString = "";//for compare value of Factorial
    static int factorial(int digits, int n) 
    { 
        int res[] = new int[digits]; //5736 max digits for 2000! factorial.
		
		
        // Initialize result 
        res[0] = 1; 
        int res_size = 1;
		
        // Apply simple factorial formula  
        // n! = 1 * 2 * 3 * 4...*n 
        for (int x = 2; x <= n; x++) 
		{
			System.out.print(" X: " +x );
			res_size = multiply(x, res, res_size);
			if( res_size == digits)
			{	
				for (int i = res_size - 1; i >= 0; i--) 
				{
					System.out.print(res[i]);
					resultString +=String.valueOf(res[i]);
				
				}
				if(text1.equals(resultString))
				{
					resultString = String.valueOf(x);
					return x;
				}
				else
				{
					
					System.out.print("The number isnot Factrorial");
					return 0;
				}
			}
		}
return 0;
		
       // for (int i = res_size - 1; i >= 0; i--) 
		//{
			//System.out.print(res[i]);
		//	resultString +=String.valueOf(res[i]);
			
			
		//}
		
		//return text1.equals(resultString);_____________________________________
    } 
      
    // This function multiplies x with the number 
    // represented by res[]. res_size is size of res[] or  
    // number of digits in the number represented by res[]. 
    // This function uses simple school mathematics for  
    // multiplication. This function may value of res_size 
    // and returns the new value of res_size 
    static int multiply(int x, int res[], int res_size) 
    { 
        ;
    } 
	

	public static void main(String[] args) 
		
	{
		;				

}