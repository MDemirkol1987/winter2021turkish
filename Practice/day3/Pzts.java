package day3;

import java.util.Scanner;

public class Pzts {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ya��n�z� giriniz");
		int sayi=scan.nextInt();
		
		
		
		
		try {
			if (sayi>0) {
				System.out.println("Girdi�iniz ya�:" + sayi);
				
			}else {
				throw new
				IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
