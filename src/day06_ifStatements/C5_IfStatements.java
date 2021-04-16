package day06_ifStatements;

import java.util.Scanner;

public class C5_IfStatements {

	public static void main(String[] args) {
		// kullanýcýdan bir dikdörtgenin kenaruzunluklarýný alýn
		//kenar uzunluklarý eþitse kare deðilse dikdörtgen yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kenar uzunluðu giriniz");
		int kýsaKenar=scan.nextInt();
		System.out.println("diðer kenar uzunluðunu giriniz");
		int uzunKenar=scan.nextInt();

	
		if (kýsaKenar>0 && uzunKenar>0 && kýsaKenar==uzunKenar) {
			
			System.out.println("kare");
		}
		if (kýsaKenar>0 && uzunKenar>0 && kýsaKenar!=uzunKenar) {
			
			System.out.println("dikdörtgen");
			
		}
		
		if (kýsaKenar<=0 || uzunKenar<=0) {
			System.out.println("geçerli bir sayý girelim");
		}
		
	}

}
