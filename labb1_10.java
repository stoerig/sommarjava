//Author: Edvin Wahlberg 910721
//Labb 1 Uppgift 10
import java.util.Scanner;

public class labb1_10 {
//fun Prints out the number of days that are in the users input month. 1 being January and so forth. 
//Input 0 terminates the program.
	public static void main(String[] args)
	{
		int input_month;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int quit_int = 1;
		while(quit_int != 0)
		{
			System.out.println("\nEnter the number of the month you wish to learn more about: 1-12\n\n Or input 0 to quit");
			input_month = in.nextInt();
			switch(input_month)
			{
		case 1: 
			System.out.println("\n***Det är 31 dagar i Januari ***");
			break;
		case 2: 
			System.out.println("\n***Det är 28 dagar i Februari ***");
			break;
		case 3:
			System.out.println("\n***Det är 31 dagar i Mars ***");
			break;
		case 4:
			System.out.println("\n*** Det är 30 dagar i April ***");
			break;
		case 5:
			System.out.println("\n*** Det är 31 dagar i Maj ***");
			break;
		case 6:
			System.out.println("\n*** Det är 30 dagar i Juni ***");
			break;
		case 7: 
			System.out.println("\n*** Det är 31 dagar i Juli ***");
			break;
		case 8:
			System.out.println("\n*** Det är 31 dagar i Augusti ***");
			break;
		case 9:
			System.out.println("\n*** Det är 30 dagar i September ***");
			break;
		case 10:
			System.out.println("\n*** Det är 31 dagar i Oktober ***");
			break;
		case 11:
			System.out.println("\n*** Det är 30 dagar i November ***");
			break;
		case 12:
			System.out.println("\n*** Det är 31 dagar i December ***");
			break;
		case 0:
			System.out.println("\nShutting down:'(");
			quit_int = 0;
			break;
		default:
			System.out.println("Invalid month, there are only 12 months! 1-12 are all valid inputs\nInput any integer to continue: ");
			input_month = in.nextInt();
			break;
			}
		}	
	}
}
