//Author: Edvin Wahlberg 910721
// Labb 1 Uppgift 4
import java.util.Scanner;

public class labb1_4
{
// fun main
// prints out input integer if it's greater or equal to 0
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
