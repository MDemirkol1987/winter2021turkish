package day3;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz:");
		char kelime=scan.nextLine().toUpperCase().charAt(0);
		
		switch (kelime) {
		
		case 'A':
			System.out.println("Hava Güzeldir");
			break;
		case 'B':
			System.out.println("Hava Bok Gibi :(");
			break;
		case 'C':
			System.out.println("Eh iþte:D");
			
		default:
			System.out.println("Bilgi Yok");
		}

	}

}
