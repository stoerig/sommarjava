//Author: Edvin Wahlberg 910721
//Labb 1 Uppgfit 2

import java.util.Scanner;

public class labb1_2 
{
	//Fun main
	// Prints out the sum, product and mean of input integers a, b and c
	public static void main(String[] args)
	{
	int a;
	int b;
	int c;
	
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the value of integer A");
	a = in.nextInt();
	System.out.println("Enter the value of integer B");
	b = in.nextInt();
	System.out.println("Enter the value of integer C");
	c = in.nextInt();
	
	System.out.println("The sum of A, B and C is: " + (a + b + c));
	
	System.out.println("The product of A, B and C is: " + (a * b * c));
	
	System.out.println("The mean of A, B and C is : " + ((a + b +c)/3));
	
	}
}
