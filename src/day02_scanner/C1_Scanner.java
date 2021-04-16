package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		
		//Kullanýcýdan isim isteyip ilk harfini yazdýrmak.
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen isminizi giriniz : ");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		//Stringde harflerin indexleri 0 dan baþlar.bu da ilk harf demektir.
		System.out.println("Baþharfiniz:" + " " + ilkHarf);
		
		//charAt yazdýktan sonra methodlar gelmez
		//cunku char primitive olduðu için methodlara sahib deðildir.
		
	}

}
