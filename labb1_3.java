//Edvin Wahlberg 910721
//Labb 1 Uppgift 3
import java.util.Scanner;

public class labb1_3 {

//fun main
//converts input float in mil to kilometers
	public static void main(String[] args){
		float inputMil;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv in antal mil:");
		inputMil = in.nextFloat();
		System.out.println("Det motsvarar " + (inputMil * 10) + " km");
	}
}
