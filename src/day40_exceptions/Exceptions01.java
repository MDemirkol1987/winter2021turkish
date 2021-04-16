package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici 
		//sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen yasýnýzý girin");
		int yas = scan.nextInt();
		
		if(yas>=0) {
			System.out.println("Girilen yas: " + yas);
		}else {
			throw new IllegalArgumentException();
			
		}
		System.out.println("Deneme bloke");
		
		// Java'ya bir exception throw ettirmek icin "throw " ve new keyword'larý kullanýlýr
		// bu sekilde yazdýgýmýzda Java exception throw eder ama
		// kodumuz bloke olmustur
		// bloke olmasini engellemek isterseniz kodu try catch ile surround yapabiliriz
		
		 */
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen yasýnýzý girin");
		int yas = scan.nextInt();
		
		try {
		if(yas>=0) {
			System.out.println("Girilen yas: " + yas);
		}else {
			throw new IllegalArgumentException();
			
		}
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
			System.out.println("");
		}
		
		System.out.println("Kode bloke degýl");
	}
}









