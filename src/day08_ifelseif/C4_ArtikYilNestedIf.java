package day08_ifelseif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Yýl Giriniz");
		int yil=scan.nextInt();
		
		if (yil%100==0) {
			if(yil%400==0) {
				System.out.println("Artýk Yýl");
			}else {
				System.out.println("Artýk Yýl Deðil");
			}
		}
		if (yil%100!=0) {
			if(yil%4==0) {
				System.out.println("Artýk Yýl");
			}else {
				System.out.println("Artýk Yýl Deðil");
			}
		}
		
		
	}

}
