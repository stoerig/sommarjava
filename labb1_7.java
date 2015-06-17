//Author: Edvin Wahlberg 910721
//Labb 1 Uppgift 7
import java.util.Scanner;

public class labb1_7 {
//fun main
//Uses input integers a, b and c in 5 different boolean cases.
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of integer A");
		a = in.nextInt();
		System.out.println("Enter the value of integer B");
		b = in.nextInt();
		System.out.println("Enter the value of integer C");
		c = in.nextInt();
		boolean answer_a = (a % 7 == 0);
		boolean answer_b = (c % b != 0);
		boolean answer_c = (a > b || a > c);
		boolean answer_d = (a > b && b > c);
		boolean answer_e = !(a > b && a > c) && (a > b || a > c);
		
		System.out.println("Talet A = " + a + " är jämnt delbart med 7: " + answer_a);
		System.out.println("Talet C = " + c + " är inte jämnt delbart med talet B = " + b + ": " + answer_b);
		System.out.println("Talet A = " + a + " är större än minst något av talen B och C: " + answer_c);
		System.out.println("Talet A = " + a +" är större än talet B = " + b + ", som i sin tur är större än talet C = " + c + ": " + answer_d);
		System.out.println("Talet A = "+ a + " är större än ett av talen B = " + b + " och C = " + c + " , men inte större än båda: " + answer_e);
	}
}
