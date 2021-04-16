package day16_FoorLoop;

import java.util.Scanner;

public class C06_ForLoop6 {

	private static int i;

	public static void main(String[] args) {
		
		//Kullanýcýdan bir kelime alýn ve tersten yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen kelime giriniz:");
		String kelime=scan.nextLine();
		//1.yol
		System.out.println("girdiðiniz kelimenin tersi");
		
		for(int i=kelime.length()-1;i>=0;i--) {
			System.out.print(kelime.charAt(i));
		// 2.yol	
		}
		tersineCevir(kelime);

	}
	
		public static void tersineCevir(String kelime) {
			for(int i=kelime.length()-1;i>=0;i--) {
				
		}
			System.out.print(kelime.charAt(i));
		}

		
}
