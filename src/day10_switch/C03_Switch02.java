package day10_switch;

import java.util.Scanner;

public class C03_Switch02 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan hangi günde olduðunu sorun hafta içi yada haftasonu yazdýr
		 */
		
		Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen Hangi Günde Olduðunuzu Giriniz");
		String gün=scan.nextLine().toLowerCase();
		
		switch(gün) {
		case "pazartesi":
		case "sali":
		case "çarþamba":
		case "perþembe":
		case "cuma":
			System.out.println("Hafta Ýçi");
			break;
		case "cumartesi":
			System.out.println("Hafta Sonu");
			break;
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
			default :
				System.out.println("Geçerli Gün Giriniz");
		}
	}

}
