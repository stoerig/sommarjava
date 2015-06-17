package sommar2015;

import java.util.Scanner;

public class labb1_3 {

	public static void main(String[] args){
		float inputMil;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv in antal mil:");
		inputMil = in.nextFloat();
		System.out.println("Det motsvarar " + (inputMil * 10) + " km");
	}
}
