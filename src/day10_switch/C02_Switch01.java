package day10_switch;

import java.util.Scanner;

public class C02_Switch01 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
			System.out.println("L�tfen 1-12 aras�nda bir rakam giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi){
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("May�s");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("A�ustos");
			break;
		case 9:
			System.out.println("Eyl�l");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kas�m");
			break;
		case 12:
			System.out.println("Aral�k");
			break;
		default :
			System.out.println("L�tfen 1-12 aras�nda bir rakam giriniz!!");
			
		}
		

	}

}
