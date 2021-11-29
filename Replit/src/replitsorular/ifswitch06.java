package replitsorular;

import java.util.Scanner;

public class ifswitch06 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

         Eger aynı karakterlere sahipse

        "isim ayni karakterlere sahiptir." yazdirin.

         Eger ayni kaakterlere sahip degilse

         "Dizenin benzersiz karakterleri var" yazdirin.

          Ternary kullanin.*/
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("isim girin");
		String ad=scan.next();
		     String isimKontrol=ad.length()==3?
		ad.charAt(0)==ad.charAt(1)||ad.charAt(2)==ad.charAt(1)||ad.charAt(0)==ad.charAt(2) ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var":
		          ("dize 3 karaktere esit degildir");
		System.out.println(isimKontrol);
*/
		
		
		String isim1="halil";
		
		String isim2="Ali";
		
		boolean birebiresitmi=isim1.equals("Ali");
		System.out.println(birebiresitmi);
		System.out.println(birebiresitmi==true &&isim1.length()==3 &&isim2.length()==3? "isim ayni karakterlere sahiptir." :  "Dizenin benzersiz karakterleri var");
	}

}
