package day39_exceptions;

public class Exceptions7 {

	public static void main(String[] args) {
		// Data turlerini casting yaparken uygun olmayan islem yaparsiniz
				// Java ClassCastException verir
				
				// Eger tamamen sayilardan olsumayan bir String'i int'a cevirmeye cal�s�rsan�z
				// JavaNumberFormatException verir
				
				int sayi = 10;
				//String str = sayi; // CTE 
				
				String str = "123456";
				
				System.out.println(str+10);//12345610
				
				
				int strSayi = Integer.parseInt(str);
				System.out.println(strSayi+10);//123466
				System.out.println(str+20);//12345620
				
				String str2="123a45";
				//System.out.println(Integer.parseInt(str2)); // NumberFormatException
				
				Object sayi2=40;
				String sayiStr=(String)sayi2; // Explicit narrowing
				                              // ClassCastException


	}

}
