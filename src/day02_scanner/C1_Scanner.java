package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan isim isteyip ilk harfini yazd�rmak.
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("L�tfen isminizi giriniz : ");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		//Stringde harflerin indexleri 0 dan ba�lar.bu da ilk harf demektir.
		System.out.println("Ba�harfiniz:" + " " + ilkHarf);
		
		//charAt yazd�ktan sonra methodlar gelmez
		//cunku char primitive oldu�u i�in methodlara sahib de�ildir.
		
	}

}
