package day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullan�c�dan de�erler alarak integer birarray olu�turun.
		// once kullan�c�dan girece�i say� adetini almam�z laz�m ki array olu�tural�m.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen ka� say�dan olu�an bir array istedi�inizi yaz�n�z:");
		int uzunluk=scan.nextInt();
		int arr[]=new int[uzunluk];
		
		int sayi=0;
		do {
			System.out.println("L�tfen say�lar� giriniz");
			arr[sayi]=scan.nextInt();
			sayi++;
			
		}while(sayi<uzunluk);
		System.out.println(Arrays.toString(arr));
		
	}

}
