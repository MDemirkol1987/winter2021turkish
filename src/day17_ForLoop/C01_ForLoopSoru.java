package day17_ForLoop;

import java.util.Scanner;

public class C01_ForLoopSoru {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int sayi=scan.nextInt();
		if(sayi<=0) {
			System.out.println("Lütfen Pozitif Tam Sayi Giriniz!!!");
		}else {
			rakamlarToplamýYazdýr(sayi);
		}
		
		
	}


	public static void rakamlarToplamýYazdýr(int sayi) {
		
		int rakamlarToplamý=0;
		String sayi2=sayi+"";
		for(int i=0; i<sayi2.length();i++) {
			rakamlarToplamý+=sayi%10;
			sayi/=10;
		}
		System.out.println("rakamlar Toplamý:"+ rakamlarToplamý);
		
	
	}

}
