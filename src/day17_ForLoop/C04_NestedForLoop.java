package day17_ForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

	public static void main(String[] args) {
			/*Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
		  *
		  * *
		  * * *
		  * * * *
		  */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 10dan küçük sayý giriniz:");
		int sayi=scan.nextInt();

		for (int i =0;i<=sayi;i++) {
			System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		}

	}

}
