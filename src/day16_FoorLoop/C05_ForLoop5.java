package day16_FoorLoop;

import java.util.Scanner;

public class C05_ForLoop5 {

	public static void main(String[] args) {
		
		/*- Sayi 3�un kati ise sayi yerine �Java� yazdirin.
        - Sayi 5�in kati ise sayi yerine �Guzeldir� yazdirin.
        - Sayi hem 3�un hem 5�in kati ise sayi yerine �Java Guzeldir� yazdirin
        */

		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen iki tam say� giriniz:");
		int sayi=scan.nextInt();
		for (int i=1;i<=sayi;i++) {
			if (i%15==0) {
				System.out.println("Java g�zeldir");
			}else if (i%5==0) {
				System.out.print("G�zeldir ");
			}else if(i%3==0) {
				System.out.print("Java ");
			}else {
				System.out.print(i);
			}
		}
		
	}

}
