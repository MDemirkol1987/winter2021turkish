package day12_StringManupulation2;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		//IndexOf: Verilen String  ifadenin karekterlerini döndürür.
		
		String str="java ogren is sahibi ol";
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('g'));
		
		System.out.println(str.indexOf("i"));//ayný harften olursa ilk bulduðunu alýr gelir
		System.out.println(str.indexOf("sa"));	// string olaný seçersek kelime olarak da aratabiliriz	
		
		System.out.println(str.indexOf('a', 4)); //baþlangýç indexi inclusive. Yani 4 den soraki ilk a yý bulur getirir.
		
		//kullanýcýdan bir cümle isteyin ve içerisinde java olup olmadýðýný bul
		
		Scanner scan=new Scanner(System.in);
		System.out.println("cümle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int sonuc=cumle.indexOf("java");//eðer java varsa ilk java kelimesinin indexini döndürür
										//yoksa -1 olarak döndürür
		System.out.println(sonuc==-1?"java yok":"java var");
		

	}
}
