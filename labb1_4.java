package sommar2015;

import java.util.Scanner;

public class labb1_4
{
	
	public static void main(String[] args)
	{
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("What's your age, friend?");
		age = in.nextInt();
		if(age < 0)
			{
			System.out.println("Invalid age, age must be greater or equal to 0");	
			}
		else
			{
		System.out.println("Your age is " + age + " that's really great for you!");
			}
	}
}
