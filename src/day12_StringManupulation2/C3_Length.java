package day12_StringManupulation2;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		
		// length String bir ifadenin i�erisindeki uzunlu�u verir.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz");
		String str=scan.nextLine().toUpperCase();
		System.out.println(str.charAt(str.length()-1));// son harfi yazd�rmak i�in
		
		String str2=""; // "Ali" --> 3
		System.out.println(str2.length()); // 0 tane karekter var manas�nda.
		
		String str3=null;
		System.out.println(str3.length());
		
		
		
	}

}
