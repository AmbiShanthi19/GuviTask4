

package task4;

import java.util.Scanner;

public class Program5 {

	static boolean Prime(int n)   
	{    
	    if (n <= 1)   {  
	           return false; 
	    }
	       for (int i = 2; i <= Math.sqrt(n); i++)   
	       {
	    	   if (n % i == 0) {  
	       
	               return false;   
	    	   }
	       }
	       
	       return true;    
	   }    
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the number : ");  
	       int num = s.nextInt(); 
	       if (Prime(num))
	       {
	    	   System.out.println(num + " is a prime number");
	       } else {
	    	   System.out.println(num + " is not a prime number");
	       }
		
	}

}
