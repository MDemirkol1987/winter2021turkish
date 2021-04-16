package day15_methodcreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi giriniz:");
		int sayi=scan.nextInt();
		
		negpoz(sayi);
		tekCift(sayi);
		yuzBuyuk(sayi);

	}
		private static void yuzBuyuk(int sayi) {
			
			if (sayi>=100) {
				
				int sayi1=sayi%10;
				sayi/=10;
				int sayi2=sayi%10;
				sayi/=10;
				int sayi3=sayi%10;
				System.out.println(sayi1+sayi2+sayi3);
				
			}else if (sayi<100) {
				System.out.println(sayi%10);
			}
	}
		public static void tekCift(int sayi) {
			
			System.out.println(sayi%2==0?"çift":"tek");
		
	}
		public static void negpoz(int sayi) {
			
			if (sayi>0) {
				System.out.println("pozitif");
			}else if(sayi<0) {
				System.out.println("negatif");
			}else if(sayi==0) {
				System.out.println("nötr");
			} 
			
			
		}
		
}
