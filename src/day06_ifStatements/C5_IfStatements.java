package day06_ifStatements;

import java.util.Scanner;

public class C5_IfStatements {

	public static void main(String[] args) {
		// kullan�c�dan bir dikd�rtgenin kenaruzunluklar�n� al�n
		//kenar uzunluklar� e�itse kare de�ilse dikd�rtgen yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kenar uzunlu�u giriniz");
		int k�saKenar=scan.nextInt();
		System.out.println("di�er kenar uzunlu�unu giriniz");
		int uzunKenar=scan.nextInt();

	
		if (k�saKenar>0 && uzunKenar>0 && k�saKenar==uzunKenar) {
			
			System.out.println("kare");
		}
		if (k�saKenar>0 && uzunKenar>0 && k�saKenar!=uzunKenar) {
			
			System.out.println("dikd�rtgen");
			
		}
		
		if (k�saKenar<=0 || uzunKenar<=0) {
			System.out.println("ge�erli bir say� girelim");
		}
		
	}

}
