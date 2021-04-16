package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("/Users/ademugurlugelen/eclipse-workspace/winter2021turkish/src/day39_exceptions/File");
		
		// tyr-catch blogu exception ile handle etmekte kullanýlýr
		// throws keyword'u ise sadece decleration'dir, dolayýsýyla
		// throws kullanýlan bir mthod'da exception olusurssa KOD BLOKE OLUR
		int k=0;
		
		while ((k=fis.read())!=-1) {
				System.out.print((char)k);
		} 
		
		// Eger birden fazla exception icin throws keyword'u kullanacaksak 
		// yazacagýmýz exceptionlarin arasýndaki iliski ve sýralama onemlý olur
		// eger yazdýgýmýz exception'lar arasýndaki parent-child iliskisi varsa
		// once child excepiton yazýlmalýdýr, aksi takdirde child exc. erisilemez olur
		
		
		//Eger yazacaklarimiz arasinda Parent-Child iliskisi varsa istersek
        //sadece Parent'i yazmamiz da yeterli olur
		
		
		
		
		
		
		
		/*
	   THROWS:
1- Throws kelimesi birden fazla exceptions icin kullanilir ve virgul ile ayrilir.
2- coklu exception’lar throws kullanilarak firlatilabilir.
3- Throws kelimesi method signature ile kullanilir
4- Syntax olarak throws kelimesi exception class adindanonce kullanilir
	    
	    */
		
		/*THROW:
			1- Aleni sekilde exception throw eder
			2- throw bir tane exception firlatmakicin kullanilir
			3- throw method icinde kullanilir
			4- Syntac olarak throw kelimesinden sonra instance variable kullanilir
		
		*/
		
		
		
		
		
		
		
		
        

		
	}

}