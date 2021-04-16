package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		//Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir Harf giriniz");
		char ilkHarf=scan.nextLine().charAt(0);
		
		if(ilkHarf>='a'&& ilkHarf<='z'&& ilkHarf>='A') {
			System.out.println("Küçük Harf");
		}else if(ilkHarf>='A'&& ilkHarf<='Z') {
			System.out.println("Büyük Harf");
		}else {
			System.out.println("Hatalý giriþ");
		}
		

	}

}
