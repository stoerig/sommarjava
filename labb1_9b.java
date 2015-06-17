//Author: Edvin Wahlberg
//Labb 1 Uppgift 9b

public class labb1_9b
{
//fun main
//returns the sum of all even numbers between 0-200. Using a for-loop.
	public static void main(String[] args)
	{
		int i;
		int acc = 0;
		for(i = 100; i > 0; i--)
		{
		 acc = i * 2 + acc;
		}
		System.out.println(acc);
	}
}
