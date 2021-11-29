package replitsorular;

import java.util.Scanner;

public class forwhilesoru1 {

	public static void main(String[] args) {
		//Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
		//ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime ieriniz");
		String kelime=scan.nextLine();
		System.out.println("Lutfen bir karakter giriniz:");
	    char krk=scan.next().charAt(0)		;
	    int kacKere=0;
	    
	    for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)==krk) {
				kacKere++;
			}
		}
		
		System.out.println("Number of a = " + kacKere); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
