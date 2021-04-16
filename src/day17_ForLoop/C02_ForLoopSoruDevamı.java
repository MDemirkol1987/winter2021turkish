package day17_ForLoop;

import java.util.Scanner;

public class C02_ForLoopSoruDevamý {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int sayi=scan.nextInt();
		System.out.println("lütfen sýnýr deðeri giriniz:");
		int sinir=scan.nextInt();
		if(sayi<=0) {
			System.out.println("Lütfen Pozitif Tam Sayi Giriniz!!!");
		}else {

			if(rakamlarToplamýYazdýr(sayi)>sinir) {
				System.out.println("a");
			}else {
				System.out.println("b");
			}

		}
		
		
	}

	public static int rakamlarToplamýYazdýr(int sayi) {
		
		int rakamlarToplamý=0;
		String sayi2=sayi+"";
		for(int i=0; i<sayi2.length();i++) {
			rakamlarToplamý+=sayi%10;
			sayi/=10;
		}
		return rakamlarToplamý;
		
		
	}

}
