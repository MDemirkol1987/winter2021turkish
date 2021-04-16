package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("birinci sayı giriniz");
		int sayi1=scan.nextInt();
		System.out.println("ikinci sayıyı girin");
		int sayi2=scan.nextInt();
		
		System.out.println(sayi1>=sayi2?sayi1:sayi2);
	}

}
