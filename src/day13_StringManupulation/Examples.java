package day13_StringManupulation;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		/*
        Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
        ve asagidaki gibi yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isim giriniz:");
		String isim=scan.nextLine();
		System.out.println("Lütfen soyisim giriniz:");
		String soyisim=scan.nextLine();
		System.out.println("Lütfen Kart Numarasý giriniz :");
		String kartno=scan.nextLine();
		
		
		
		char ilkharf=isim.toUpperCase().charAt(0);
		String isimSonrasi=isim.substring(1).replaceAll("\\w", "*");
		
		char soyilkharf=soyisim.toUpperCase().charAt(0);
		String soyisimSonrasi=soyisim.substring(1).replaceAll("\\w", "*");
		System.out.println("isim-soyisim:"+ilkharf+isimSonrasi+" "+soyilkharf+soyisimSonrasi);
		
int hane=kartno.length();
		
		if (hane==16) {
			System.out.println("Teþekkürler");
		}else {
			System.out.println("Lütfen 16 haneli kod giriniz");
		}
		
		String kartson=kartno.substring(12);
		String kartIlk=kartno.substring(0, 12).replaceAll("\\w", "*");
		
		System.out.println("Kart No:"+ kartIlk + kartson);
		
		
		
		
		

	}

}
