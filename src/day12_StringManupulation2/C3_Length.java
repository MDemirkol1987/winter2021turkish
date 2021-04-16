package day12_StringManupulation2;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		
		// length String bir ifadenin içerisindeki uzunluğu verir.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz");
		String str=scan.nextLine().toUpperCase();
		System.out.println(str.charAt(str.length()-1));// son harfi yazdırmak için
		
		String str2=""; // "Ali" --> 3
		System.out.println(str2.length()); // 0 tane karekter var manasında.
		
		String str3=null;
		System.out.println(str3.length());
		
		
		
	}

}
