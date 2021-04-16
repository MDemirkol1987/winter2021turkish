package day06_ifStatements;

import java.util.Scanner;

public class C4_IfStatements {

	public static void main(String[] args) {
		// kullanýcýdan gün ismini isteyin
		//girilen gün hafta içi veya haftasonu olduðunu yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismi giriniz:");
		String gün=scan.next().toLowerCase();
		
		//Stringlerde eþitlik sorgularken equals methodu kullanýlýr.
		
		if (gün.equals("pazartesi") || gün.equals("sali") || gün.equals("çarþamba") || gün.equals("perþembe") || gün.equals("cuma")) {
			System.out.println("haftaiçi günüdür.");
		}
		
		if (gün.equals("cumartesi") || gün.equals("pazar")) {
			System.out.println("haftasonu günüdür.");
			
		}

	}

}
