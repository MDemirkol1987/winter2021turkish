package day06_ifStatements;

import java.util.Scanner;

public class C4_IfStatements {

	public static void main(String[] args) {
		// kullan�c�dan g�n ismini isteyin
		//girilen g�n hafta i�i veya haftasonu oldu�unu yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen g�n ismi giriniz:");
		String g�n=scan.next().toLowerCase();
		
		//Stringlerde e�itlik sorgularken equals methodu kullan�l�r.
		
		if (g�n.equals("pazartesi") || g�n.equals("sali") || g�n.equals("�ar�amba") || g�n.equals("per�embe") || g�n.equals("cuma")) {
			System.out.println("haftai�i g�n�d�r.");
		}
		
		if (g�n.equals("cumartesi") || g�n.equals("pazar")) {
			System.out.println("haftasonu g�n�d�r.");
			
		}

	}

}
