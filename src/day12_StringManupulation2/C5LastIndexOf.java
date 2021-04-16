package day12_StringManupulation2;

import java.util.Scanner;

public class C5LastIndexOf {

	public static void main(String[] args) {
		
		//lastIndexOf en son indexi bize verir
		
		String str="mustafa";
		System.out.println(str.lastIndexOf('a')); // en sondaki a yý verdi aynýsý string seçinde de böyle
		
		//kullanýcýdan bir cümle alýn 
		//ve aþaðýdaki 3 durumdan uygun olaný yazdýrýn
		//1- cumle java içermiyor
		//2- cumle 1 tane java içeriyor
		//3- cumlede birden fazla java var
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str1=scan.nextLine().toUpperCase();
		
		int soru1=str1.indexOf("JAVA");
		int soru2=str1.lastIndexOf("JAVA");
		
		if(soru1==-1) {
			System.out.println("cumle java içermiyor");
		}else if(soru2==soru1) {
			System.out.println("cumle bir java kelimesi içeriyor");
		}else {
			System.out.println("cumle birden fazla java içeriyor");
		}
		
				
		
		
		
		

	}

}
