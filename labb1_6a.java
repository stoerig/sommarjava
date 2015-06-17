package sommar2015;

import java.util.Scanner;

public class labb1_6a 
{
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
