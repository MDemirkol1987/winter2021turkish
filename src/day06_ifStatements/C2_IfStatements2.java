package day06_ifStatements;

import java.util.Scanner;

public class C2_IfStatements2 {

	public static void main(String[] args) {
		//kullan�c�dan bir say� isteyin tek veya �ift say� oldu�unu yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir rakam giriniz:");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("�ift Sayi");
		}
		
		if (sayi%2==1 || sayi%2<0) {
			System.out.println("Tek Sayi");
			
		}

	}

}
