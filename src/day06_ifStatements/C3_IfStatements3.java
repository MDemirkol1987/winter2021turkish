package day06_ifStatements;

import java.util.Scanner;

public class C3_IfStatements3 {

	public static void main(String[] args) {
		
		//Kullan�c�dan g�n isminin ilk harfini isteyin ve harfe uygun olan g�n isimlerini yazd�r�n

		Scanner scan=new Scanner(System.in);
		System.out.println("herhangi bir harf giriniz:");
		char harf=scan.next().toUpperCase().charAt(0);
		
		if (harf=='P') {
			System.out.println("pazartesi-pazar-per�embe");
			
		}
		if (harf=='S') {
			System.out.println("sal�");
		}
		if (harf=='�') {
			System.out.println("�ar�amba");
		}
		if (harf=='C') {
			System.out.println("cuma-cumartesi");
			
		}
		if (harf!='P' && harf!='S' &&harf!='�' &&harf!='C' ) {
			System.out.println("Bu harf ile ba�layan g�n ismi yoktur");
		}
	}

}
