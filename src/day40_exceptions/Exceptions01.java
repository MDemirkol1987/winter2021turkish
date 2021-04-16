package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici 
		//sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen yas�n�z� girin");
		int yas = scan.nextInt();
		
		if(yas>=0) {
			System.out.println("Girilen yas: " + yas);
		}else {
			throw new IllegalArgumentException();
			
		}
		System.out.println("Deneme bloke");
		
		// Java'ya bir exception throw ettirmek icin "throw " ve new keyword'lar� kullan�l�r
		// bu sekilde yazd�g�m�zda Java exception throw eder ama
		// kodumuz bloke olmustur
		// bloke olmasini engellemek isterseniz kodu try catch ile surround yapabiliriz
		
		 */
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen yas�n�z� girin");
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
		
		System.out.println("Kode bloke deg�l");
	}
}









