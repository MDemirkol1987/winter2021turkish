package day10_switch;

import java.util.Scanner;

public class C04_Switch03 {

	public static void main(String[] args) {
		// kullan�c�dan VIP k�saltmas�nda hangi harfin anlam�n� istedi�ini soral�m
		//girilen harfin a��klamas�n� yazd�ral�m
		
		Scanner scan=new Scanner(System.in);
			System.out.println("hangi harfin anlam�n� istiyorsunuz");
			char harf=scan.nextLine().charAt(0);			
			switch(harf) {
			
			case 'v':
			case 'V':
				System.out.println("Very");
				break;
			case 'i':
			case 'I':
				System.out.println("Important");
				break;
			case 'p':
			case 'P':
				System.out.println("Person");
				break;
			default :
				System.out.println("Ge�erli Harf Giriniz");
			
			}

	}

}
