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
		
		String sonu�=sayi%2==0?"�ift sayi":"tek sayi";
		System.out.println(sonu�);
		
		System.out.println(sayi>0?sayi:-sayi);
	}

}
