package day08_ifelseif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		/* 
		 Kullan�c�dan g�n ismini yazmas�n� isteyin
		 Girilen isim ge�erli bir g�n ise g�n isminin 1.2. ve 3. harflerini
		 ilk har b�y�k di�er ikisi k���k olarak yazd�r�n.
		 gun ismi ge�erli de�ilse G�erli G�n Giriniz yazd�r�n.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen G�n �smini Giriniz");
		String g�nIsmi=scan.nextLine().toLowerCase();//Girilen t�m yaz�y� k���k harfe �evirdik.
		
		if(g�nIsmi.equalsIgnoreCase("pazar") || g�nIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if (g�nIsmi.equalsIgnoreCase("sali")) {
			System.out.println("Sal");
		}else if (g�nIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}else if (g�nIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		}else if (g�nIsmi.equalsIgnoreCase("cuma")) {
			System.out.println("Cum");
		}else {
			System.out.println("L�tfen Ge�erli G�n Giriniz");
		}
		//equalsIgnoreCase() :methodu iki string b�y�k kucuk harf olmadan esit olup olmadi�ini kontrol eder.
		
		

	}

}
