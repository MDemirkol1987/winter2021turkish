package day17_ForLoop;

import java.util.Scanner;

public class C02_ForLoopSoruDevam� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		int sayi=scan.nextInt();
		System.out.println("l�tfen s�n�r de�eri giriniz:");
		int sinir=scan.nextInt();
		if(sayi<=0) {
			System.out.println("L�tfen Pozitif Tam Sayi Giriniz!!!");
		}else {

			if(rakamlarToplam�Yazd�r(sayi)>sinir) {
				System.out.println("a");
			}else {
				System.out.println("b");
			}

		}
		
		
	}

	public static int rakamlarToplam�Yazd�r(int sayi) {
		
		int rakamlarToplam�=0;
		String sayi2=sayi+"";
		for(int i=0; i<sayi2.length();i++) {
			rakamlarToplam�+=sayi%10;
			sayi/=10;
		}
		return rakamlarToplam�;
		
		
	}

}
