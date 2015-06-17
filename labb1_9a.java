//Author: Edvin Wahlberg 910721
//Lab 1 Uppgift 9a

public class labb1_9a 
{
//fun main
//Prints out the sum of all even numbers between 0-200
	public static void main(String[] args)
	{
		int integer = 200;
		int acc = 0;
		while(integer > 0)
		{
			acc = acc + integer;
			integer = integer - 2;
		}
		System.out.println(acc);
	}
	
}
