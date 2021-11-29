package replitsorular;

import java.util.Scanner;

public class ifswitchternary01 {

	public static void main(String[] args) {
		/* Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

          IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
          BMI 18,5'in altındaysa zayıfsınız
          BMI 18,5 ile 25 arasında ise kilonuz idealdir
          BMI 25-30 arasındaysa şişmansınız
          BMI 30'dan büyük veya eşitse, obez
          Input:
          Output:           
          Agirlik : 71
          Boy : 1,72
          BMI : 23.99945916711736
          Zayifsiniz.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kilonuzu giriniz: ");
		double kilo=scan.nextDouble();
		System.out.println("Lutfen bozunuzu giriniz: ");
		double boy=scan.nextDouble();
		
        double BMI=kilo/(boy*boy);
        System.out.println(BMI);
        
        if (BMI< 18.5) {
			System.out.println("zayıfsınız");
		}if (BMI>=18.5 && BMI<25) {
			System.out.println("kilonuz idealdir");
		}if (BMI>=25 && BMI<30) {
			System.out.println("sismansiniz");
		}if (BMI>=30) {
			System.out.println("obez");
		}
        
        
        
	}

}
