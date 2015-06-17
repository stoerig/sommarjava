//Author: Edvin  Wahlberg
//Labb 1 Uppgift 9c

public class labb1_9c
{
//Prints out the sum of all even numbers between 0-200. Using a do-while-loop.
	public static void main(String[] args)
	{
		int acc = 0;
		int start_int = 200;
		do
		{
		acc = acc + start_int;
		start_int = start_int - 2;
		}
		while(start_int > 0);
		System.out.println(acc);
	}

}
