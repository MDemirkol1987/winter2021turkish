package day08_ifelseif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Y�l Giriniz");
		int yil=scan.nextInt();
		
		if (yil%100==0) {
			if(yil%400==0) {
				System.out.println("Art�k Y�l");
			}else {
				System.out.println("Art�k Y�l De�il");
			}
		}
		if (yil%100!=0) {
			if(yil%4==0) {
				System.out.println("Art�k Y�l");
			}else {
				System.out.println("Art�k Y�l De�il");
			}
		}
		
		
	}

}
