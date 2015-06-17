//Author: Edvin Wahlberg 910721
// Labb 1 Uppgift 6a(for-loop)

import java.util.Scanner;

public class labb1_6a 
{
//fun main
//prints out all integers up to the input integer, input must be greater than 0. 
	public static void main(String[] args)
	{
		int countdown_int;
		Scanner in = new Scanner(System.in);
		System.out.println("What integer would you like to count down from?");
		countdown_int = in.nextInt();
		if(countdown_int <= 0)
		{
			System.out.println("Input integer must be greater than 0");
		}
		else
		{
			for(int i = countdown_int; i > 0; i--)
				{
			System.out.println(countdown_int);
			countdown_int = countdown_int - 1;
				}
		}
	}
}
