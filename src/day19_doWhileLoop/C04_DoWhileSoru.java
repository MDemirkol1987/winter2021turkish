package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileSoru {

	public static void main(String[] args) {
		/* Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini
   yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		 */
		
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int sayi=1;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen toplamak için sayýlarý giriniz:");
		
		do {
			
			sayi=scan.nextInt();
			if (sayi<0) {
				System.out.println("Negatif tam sayý giremezsiniz");
				countNeg++;
				
			}
			if (sayi>0) {
				System.out.println("pozitif tam sayý giriniz");
				countPoz++;
				toplamPoz+=sayi;
				
				
			}
			
			
		} while (sayi!=0);
			
		System.out.println(countNeg);
		System.out.println(countPoz);
		System.out.println(toplamPoz);
			
		
		
		
	}

}
