package day16_FoorLoop;

import java.util.Scanner;

public class C06_ForLoop6 {

	private static int i;

	public static void main(String[] args) {
		
		//Kullan�c�dan bir kelime al�n ve tersten yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen kelime giriniz:");
		String kelime=scan.nextLine();
		//1.yol
		System.out.println("girdi�iniz kelimenin tersi");
		
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
