package pkg;

import java.util.Scanner;

public class EvenOddPgm {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		a = sc.nextInt();
		
		if( a % 2 == 0) 
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		
		
	}

}
