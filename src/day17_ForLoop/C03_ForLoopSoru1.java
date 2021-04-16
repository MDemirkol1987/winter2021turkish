package day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoopSoru1 {

	public static void main(String[] args) {
		//Kullanýcýdan 35 dan küçük pozitif bir sayý alýn
		//girilen sayýnýn faktöriyelini hesaplayan method yazýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 0-35 arasýnda bir sayý giriniz:");
		long sayi=scan.nextInt();
		
		faktoriyel(sayi);
		
	}

	public static void faktoriyel(long sayi) {
		
		long carpým=1;
		for(long i=sayi;i>=1;i--) {
		carpým*=i;	
		}System.out.println(carpým);
	}

}
