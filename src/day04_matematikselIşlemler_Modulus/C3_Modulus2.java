package day04_matematikselIþlemler_Modulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// Kullanicidan 4 basamakli bir sayi alacaðýz 
		//sayýnýn basamaklarýný ters sýrada yazdýralým
		
		Scanner scan = new Scanner (System.in);
		System.out.println("4 basamaklý sayi giriniz: ");
		int sayi=scan.nextInt();
		System.out.println(sayi);
		
		int sayi1=sayi%10;
		sayi/=10;
		int sayi2=sayi%10;
		sayi/=10;
		int sayi3=sayi%10;
		sayi/=10;
		int sayi4=sayi%10;
		
		
		System.out.print(sayi1);
		System.out.print(sayi2);
		System.out.print(sayi3);
		System.out.print(sayi4);
	}

}
