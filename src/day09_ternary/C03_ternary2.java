package day09_ternary;

import java.util.Scanner;

public class C03_ternary2 {

	public static void main(String[] args) {
		/*
		 * Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		String sonuç=sayi%2==0?"çift sayi":"tek sayi";
		System.out.println(sonuç);
		
		System.out.println(sayi>0?sayi:-sayi);
	}

}
