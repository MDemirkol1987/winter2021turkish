package day08_ifelseif;

import java.util.Scanner;

public class C3_ArtikYýl {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Yýl Giriniz");
		int yil=scan.nextInt();
		
		
		
		if(yil%4==0 && yil%100!=0) {
			System.out.println("Artýk Yýl");	
		}else if( yil%100!=0 && yil%400==0) {
			System.out.println("Artýk Yýl");
		}else {
			System.out.println("Artýk Yýl Deðil");
		}
	
		
		
	}

}
