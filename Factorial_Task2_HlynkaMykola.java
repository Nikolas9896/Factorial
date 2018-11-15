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
      
    static String resultString = "";
	static String userInputFactorial = "";
	//*************factorial********************
	/*This function finds factorial of small and large numbers.
	***Return 0 --------if it's not integer factorial 
	***Return int n --- if n is integer factorial, max value = 2000! The number of digits in 2000 factorial is 5736.
	*/
    static int factorial(int digits, int n) 
    { 
        // Apply simple factorial formula  
        // n! = 1 * 2 * 3 * 4...*n
		if ( digits == 1 )
			{
				int resultInt = 1;
				if(userInputFactorial.equals("0") || userInputFactorial.equals("1") )
				{
					resultString = "1";
					return resultInt;
				}
				else if(userInputFactorial.equals("2"))
				{
					resultString = "2";
					resultInt+=1;
					return resultInt;
				}
				else if(userInputFactorial.equals("6"))
				{
					resultString = "3";
					resultInt+=2;
					return resultInt;
				}
				else
				{
					System.out.print("The number is not Factorial");
					return 0;
				}
			
		}
		else
		{	
			int res[] = new int[5736]; //5736 max digits for 2000! factorial.
			res[0] = 1; 
			int res_size = 1;
			for (int x = 2; x <= n; x++) 
			{
				res_size = multiply(x, res, res_size);
				if( res_size == digits)
				{	
					for (int i = res_size - 1; i >= 0; i--) 
					{
						
						resultString +=String.valueOf(res[i]);
					
					}
					if(userInputFactorial.equals(resultString))
					{						
						resultString = String.valueOf(x);
						return x;
					}
					else
					{
						x+=1;
						res_size = multiply(x, res, res_size);
						resultString = "";
						for (int i = res_size - 1; i >= 0; i--) 
						{
						
							resultString +=String.valueOf(res[i]);
					
						}
						
						if( userInputFactorial.equals(resultString))
						{	
															
									resultString = String.valueOf(x);
									System.out.print("X: "+x);
									return x;
							
						}	
						
						System.out.print("The number is not Factorial");
						return 0;
					}
				}
			}
		}
		return 0;
		       
    } 
      
    // This function multiplies x with the number 
    // represented by res[]. res_size is size of res[] or  
    // number of digits in the number represented by res[]. 
    // This function uses simple school mathematics for  
    // multiplication. This function may value of res_size 
    // and returns the new value of res_size 
    static int multiply(int x, int res[], int res_size) 
    { 
        int carry = 0; // Initialize carry 
  
        // One by one multiply n with individual  
        // digits of res[] 
        for (int i = 0; i < res_size; i++) 
        { 
            int prod = res[i] * x + carry; 
            res[i] = prod % 10; // Store last digit of  
                                // 'prod' in res[] 
            carry = prod/10; // Put rest in carry
			
			
        } 
  
        // Put carry in res and increase result size 
        while (carry!=0) 
        { 
            res[res_size] = carry % 10; 
            carry = carry / 10; 
            res_size++;
					
        } 
		
        return res_size;
    } 
	

	public static void main(String[] args) 
		
	{
		System.out.println("Task 2: Factorial 2000 Max");
		System.out.println("Input number of factorial(max digits number 5736) and get you n!");
		
		Scanner factorialLargeNumber = new Scanner(System.in);
		userInputFactorial = factorialLargeNumber.next();
		int digitsNumber = userInputFactorial.length();
		
		if(digitsNumber < 5737 )//2000! Max + 1 digits Number
		{
			int indexFactFunction = factorial(digitsNumber, 2000);//2000factorial is Max if you need more change digits condition and this 2000
			if(indexFactFunction !=0)
			{
				System.out.println("The n: ");
				System.out.println(resultString);
			}
			
		}
		else if (digitsNumber != 1)
			{
				System.out.println("The digits number is much then 2000! Factorial");
			}
		
	}

}