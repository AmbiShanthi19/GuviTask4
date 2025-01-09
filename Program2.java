

package task4;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner Obj=new Scanner(System.in);
		int b=Obj.nextInt();
		if( b % 2==0)
		{
			System.out.println("Given integer is even number");
		}
		else {
			System.out.println("Given Integer is odd number");
		}
	}

}
