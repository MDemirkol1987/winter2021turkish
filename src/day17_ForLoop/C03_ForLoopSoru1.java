package day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoopSoru1 {

	public static void main(String[] args) {
		//Kullan�c�dan 35 dan k���k pozitif bir say� al�n
		//girilen say�n�n fakt�riyelini hesaplayan method yaz�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 0-35 aras�nda bir say� giriniz:");
		long sayi=scan.nextInt();
		
		faktoriyel(sayi);
		
	}

	public static void faktoriyel(long sayi) {
		
		long carp�m=1;
		for(long i=sayi;i>=1;i--) {
		carp�m*=i;	
		}System.out.println(carp�m);
	}

}
