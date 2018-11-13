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
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 

	{
		int squares = 0, matches = 0, one1 = 1, billion = 1000000000;
	    
	    System.out.println("***Task 1: Matches***");
	    
	    while ( squares < one1 || squares > billion )
	        {
	      
	         System.out.println("Input number of squares:");
	         Scanner S=new Scanner(System.in);
             squares=S.nextInt();
        
        
	        }
	     System.out.println(" The minimum number of matches required to construct " + squares + " squares: " + matches);
	}
}