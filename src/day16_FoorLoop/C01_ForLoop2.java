package day16_FoorLoop;

import java.util.Scanner;

public class C01_ForLoop2 {

	public static void main(String[] args) {
		
		//Kullanýcýdan pozitif 2 tamsayý alýn
		//aldýðýmýz deðerlerden kucuk olandan baþlayýp buyuk olana kadar
		//Tüm sayýlarý yan yana virgulle ayýrarak yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen iki tam sayý giriniz:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1<0||sayi2<0||sayi1==sayi2) {
			System.out.println("geçerli sayý giriniz.");
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
