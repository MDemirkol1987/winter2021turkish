package day19_doWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int sayi=0;
		do {
			System.out.println("Pozitif tam sayý giriniz:");
			sayi=scan.nextInt();
		} while (sayi<=0);
		System.out.println("Aferin!!!");
	}

}
