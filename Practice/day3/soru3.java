package day3;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen bir kelime giriniz:");
		char kelime=scan.nextLine().toUpperCase().charAt(0);
		
		switch (kelime) {
		
		case 'A':
			System.out.println("Hava G�zeldir");
			break;
		case 'B':
			System.out.println("Hava Bok Gibi :(");
			break;
		case 'C':
			System.out.println("Eh i�te:D");
			
		default:
			System.out.println("Bilgi Yok");
		}

	}

}
