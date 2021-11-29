package replitsorular;

import java.util.Scanner;

public class scannersoru4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Gunde kac bardak cay iciyorsunuz: ");
		System.out.println("Caya gunluk kac seker atiyorsunuz: ");
		double seker=scan.nextDouble();
		
		double gunlukseker = seker*1.7*1/1000;
		System.out.println("Yilda " + (365*gunlukseker) + " kg seker kullaniyor.");
		
		
		

	}

}
