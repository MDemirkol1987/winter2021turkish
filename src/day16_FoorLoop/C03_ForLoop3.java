package day16_FoorLoop;

import java.util.Scanner;

public class C03_ForLoop3 {

	public static void main(String[] args) {
		
		//Kullanýcýdan pozitif bir sayý alýn
		//1 den kullanýcýnýn girdiði sayýya kadar olan tüm tam sayýlarýn toplamýný yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen pozitif tam sayý giriniz:");
		int sayi=scan.nextInt();
		int toplam=0;
		if(sayi<=0) {
			System.out.println("geçerli sayi giriniz");
		}else if (sayi>0){
			for (int i=1;i<=sayi;i++) {
				toplam+=i;		
			}System.out.println(toplam);
		}

	}

}
