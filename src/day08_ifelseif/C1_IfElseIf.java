package day08_ifelseif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		/* 
		 Kullanýcýdan gün ismini yazmasýný isteyin
		 Girilen isim geçerli bir gün ise gün isminin 1.2. ve 3. harflerini
		 ilk har büyük diðer ikisi küçük olarak yazdýrýn.
		 gun ismi geçerli deðilse Gçerli Gün Giriniz yazdýrýn.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Gün Ýsmini Giriniz");
		String günIsmi=scan.nextLine().toLowerCase();//Girilen tüm yazýyý küçük harfe çevirdik.
		
		if(günIsmi.equalsIgnoreCase("pazar") || günIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if (günIsmi.equalsIgnoreCase("sali")) {
			System.out.println("Sal");
		}else if (günIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}else if (günIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		}else if (günIsmi.equalsIgnoreCase("cuma")) {
			System.out.println("Cum");
		}else {
			System.out.println("Lütfen Geçerli Gün Giriniz");
		}
		//equalsIgnoreCase() :methodu iki string büyük kucuk harf olmadan esit olup olmadiðini kontrol eder.
		
		

	}

}
