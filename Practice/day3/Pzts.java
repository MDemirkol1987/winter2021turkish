package day3;

import java.util.Scanner;

public class Pzts {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen yaþýnýzý giriniz");
		int sayi=scan.nextInt();
		
		
		
		
		try {
			if (sayi>0) {
				System.out.println("Girdiðiniz yaþ:" + sayi);
				
			}else {
				throw new
				IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
