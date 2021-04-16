package day06_ifStatements;

import java.util.Scanner;

public class C3_IfStatements3 {

	public static void main(String[] args) {
		
		//Kullanýcýdan gün isminin ilk harfini isteyin ve harfe uygun olan gün isimlerini yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("herhangi bir harf giriniz:");
		char harf=scan.next().toUpperCase().charAt(0);
		
		if (harf=='P') {
			System.out.println("pazartesi-pazar-perþembe");
			
		}
		if (harf=='S') {
			System.out.println("salý");
		}
		if (harf=='Ç') {
			System.out.println("çarþamba");
		}
		if (harf=='C') {
			System.out.println("cuma-cumartesi");
			
		}
		if (harf!='P' && harf!='S' &&harf!='Ç' &&harf!='C' ) {
			System.out.println("Bu harf ile baþlayan gün ismi yoktur");
		}
	}

}
