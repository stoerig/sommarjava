package sommar2015;

import java.util.Scanner;

public class labb1_8
{
	public static void main(String[] args)
	{
		int multiple;
		int multiplier;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the multiplication table you want");
		multiple = in.nextInt();
		System.out.println("Enter the multiplier you want to count up to");
		multiplier = in.nextInt();
		
		if(multiple < 1 || multiplier < 1)
		{
			System.out.println("Invalid table or multiplier both must be greater than 1");
		}
		
		else
		{
			while(multiplier > 0)
			{
			System.out.println(multiple + " * " + multiplier + " = " + multiple * multiplier);
			multiplier = multiplier -1;
			}
		}
	}
	
}
