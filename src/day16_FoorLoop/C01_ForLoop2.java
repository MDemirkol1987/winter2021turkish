package day16_FoorLoop;

import java.util.Scanner;

public class C01_ForLoop2 {

	public static void main(String[] args) {
		
		//Kullan�c�dan pozitif 2 tamsay� al�n
		//ald���m�z de�erlerden kucuk olandan ba�lay�p buyuk olana kadar
		//T�m say�lar� yan yana virgulle ay�rarak yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen iki tam say� giriniz:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1<0||sayi2<0||sayi1==sayi2) {
			System.out.println("ge�erli say� giriniz.");
		}else if(sayi1<sayi2) {
			for(int i=sayi1;i<=sayi2;i++) {
				System.out.print(i + ",");
			}
		}else  {
			for(int a=sayi2;a<=sayi1;a++) {
				System.out.print(a + ",");
			}
		}
		
	}

}
