package day10_switch;

import java.util.Scanner;

public class C04_Switch03 {

	public static void main(String[] args) {
		// kullanýcýdan VIP kýsaltmasýnda hangi harfin anlamýný istediðini soralým
		//girilen harfin açýklamasýný yazdýralým
		
		Scanner scan=new Scanner(System.in);
			System.out.println("hangi harfin anlamýný istiyorsunuz");
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
				System.out.println("Geçerli Harf Giriniz");
			
			}

	}

}
