package day10_switch;

import java.util.Scanner;

public class C03_Switch02 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan hangi g�nde oldu�unu sorun hafta i�i yada haftasonu yazd�r
		 */
		
		Scanner scan=new Scanner(System.in);
			System.out.println("L�tfen Hangi G�nde Oldu�unuzu Giriniz");
		String g�n=scan.nextLine().toLowerCase();
		
		switch(g�n) {
		case "pazartesi":
		case "sali":
		case "�ar�amba":
		case "per�embe":
		case "cuma":
			System.out.println("Hafta ��i");
			break;
		case "cumartesi":
			System.out.println("Hafta Sonu");
			break;
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
			default :
				System.out.println("Ge�erli G�n Giriniz");
		}
	}

}
