package day12_StringManupulation2;

import java.util.Scanner;

public class C5LastIndexOf {

	public static void main(String[] args) {
		
		//lastIndexOf en son indexi bize verir
		
		String str="mustafa";
		System.out.println(str.lastIndexOf('a')); // en sondaki a y� verdi ayn�s� string se�inde de b�yle
		
		//kullan�c�dan bir c�mle al�n 
		//ve a�a��daki 3 durumdan uygun olan� yazd�r�n
		//1- cumle java i�ermiyor
		//2- cumle 1 tane java i�eriyor
		//3- cumlede birden fazla java var
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String str1=scan.nextLine().toUpperCase();
		
		int soru1=str1.indexOf("JAVA");
		int soru2=str1.lastIndexOf("JAVA");
		
		if(soru1==-1) {
			System.out.println("cumle java i�ermiyor");
		}else if(soru2==soru1) {
			System.out.println("cumle bir java kelimesi i�eriyor");
		}else {
			System.out.println("cumle birden fazla java i�eriyor");
		}
		
				
		
		
		
		

	}

}
