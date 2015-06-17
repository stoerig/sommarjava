package sommar2015;

import java.util.Scanner;

public class labb1_6b
{
	public static void main(String[] args)
	{
		int countdown_int;
		Scanner in = new Scanner(System.in);
		System.out.println("What integer would you like to count down from?");
		countdown_int = in.nextInt();
		if(countdown_int > 0)
		{
			do
			{
			System.out.println(countdown_int);
			countdown_int = countdown_int - 1;
			} 
			while(countdown_int > 0);
		}
		else
		{
		System.out.println("Input integer must be greater than 0");	
		}
	}
}
