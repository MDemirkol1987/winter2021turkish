package day16_FoorLoop;

import java.util.Scanner;

public class C03_ForLoop3 {

	public static void main(String[] args) {
		
		//Kullan�c�dan pozitif bir say� al�n
		//1 den kullan�c�n�n girdi�i say�ya kadar olan t�m tam say�lar�n toplam�n� yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen pozitif tam say� giriniz:");
		int sayi=scan.nextInt();
		int toplam=0;
		if(sayi<=0) {
			System.out.println("ge�erli sayi giriniz");
		}else if (sayi>0){
			for (int i=1;i<=sayi;i++) {
				toplam+=i;		
			}System.out.println(toplam);
		}

	}

}
