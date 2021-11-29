package replitsorular;

import java.util.Scanner;

public class scannersoru3 {

	public static void main(String[] args) {
		/*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve
		 dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın. 
          Örnek Çıktı:
          Alan: 32
          Çevre: 24*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin 1 kenar uzunlugunu girin: ");
		int kenar1=scan.nextInt();
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu girin: ");
		int kenar2=scan.nextInt();
		
		System.out.println("Alan: " + (kenar1*kenar2));
		System.out.println("Cevre: " + (2*(kenar1+kenar2)));
		
		
		
		
		
	}

}
