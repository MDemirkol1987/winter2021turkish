package day12_StringManupulation2;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		//IndexOf: Verilen String  ifadenin karekterlerini d�nd�r�r.
		
		String str="java ogren is sahibi ol";
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('g'));
		
		System.out.println(str.indexOf("i"));//ayn� harften olursa ilk buldu�unu al�r gelir
		System.out.println(str.indexOf("sa"));	// string olan� se�ersek kelime olarak da aratabiliriz	
		
		System.out.println(str.indexOf('a', 4)); //ba�lang�� indexi inclusive. Yani 4 den soraki ilk a y� bulur getirir.
		
		//kullan�c�dan bir c�mle isteyin ve i�erisinde java olup olmad���n� bul
		
		Scanner scan=new Scanner(System.in);
		System.out.println("c�mle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int sonuc=cumle.indexOf("java");//e�er java varsa ilk java kelimesinin indexini d�nd�r�r
										//yoksa -1 olarak d�nd�r�r
		System.out.println(sonuc==-1?"java yok":"java var");
		

	}
}
