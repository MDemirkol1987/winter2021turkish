package day06_ifStatements;

import java.util.Scanner;

public class C2_IfStatements2 {

	public static void main(String[] args) {
		//kullanýcýdan bir sayý isteyin tek veya çift sayý olduðunu yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir rakam giriniz:");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Çift Sayi");
		}
		
		if (sayi%2==1 || sayi%2<0) {
			System.out.println("Tek Sayi");
			
		}

	}

}
