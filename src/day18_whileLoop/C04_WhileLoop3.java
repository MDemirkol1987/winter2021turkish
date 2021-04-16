package day18_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop3 {

	public static void main(String[] args) {
		
		//Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden 
		//baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
		//Kullanicinin hata yapmadigini farz edin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("baþlangýç harfini giriniz:");
		char basHarf=scan.next().toUpperCase().charAt(0);
		System.out.println("bitiþ harfini giriniz:");
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		while(basHarf<=sonHarf) {
			System.out.print(basHarf+ " ");
			basHarf++;
		}
		
	}

}
