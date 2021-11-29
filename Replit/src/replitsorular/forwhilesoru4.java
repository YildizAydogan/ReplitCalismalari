package replitsorular;

import java.util.Scanner;

public class forwhilesoru4 {

	public static void main(String[] args) {
		/*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
          Input : 6
          Output: 6!=65432*1=720     */
          
		Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        
        int faktoriyel=1;
        System.out.print(sayi+"!=");
        for (int i = sayi; i >1; i--) {
            faktoriyel*=i;
            System.out.print(i);
            
        }
            System.out.println("*1="+faktoriyel);
		}
		
	}


