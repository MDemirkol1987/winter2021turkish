package day10_switch;

import java.util.Scanner;

public class C02_Switch01 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
			System.out.println("Lütfen 1-12 arasýnda bir rakam giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi){
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Þubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayýs");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("Aðustos");
			break;
		case 9:
			System.out.println("Eylül");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kasým");
			break;
		case 12:
			System.out.println("Aralýk");
			break;
		default :
			System.out.println("Lütfen 1-12 arasýnda bir rakam giriniz!!");
			
		}
		

	}

}
