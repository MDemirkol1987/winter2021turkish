package day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanýcýdan deðerler alarak integer birarray oluþturun.
		// once kullanýcýdan gireceði sayý adetini almamýz lazým ki array oluþturalým.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen kaç sayýdan oluþan bir array istediðinizi yazýnýz:");
		int uzunluk=scan.nextInt();
		int arr[]=new int[uzunluk];
		
		int sayi=0;
		do {
			System.out.println("Lütfen sayýlarý giriniz");
			arr[sayi]=scan.nextInt();
			sayi++;
			
		}while(sayi<uzunluk);
		System.out.println(Arrays.toString(arr));
		
	}

}
