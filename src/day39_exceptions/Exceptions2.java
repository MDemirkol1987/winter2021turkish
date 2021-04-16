package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions2 {
	 /*
    Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa
    Icice try-catch bloklari olusturabiliriz
    Bu ornekte ilk once dosyayi okutmak istedik
    Java "Ya dosyayi bulamazsam? " diye bizden yardim istedi
    Biz de try-catch blogu ile FIleNOtFoundException ile handle etmesinde yardimci olduk
    Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam " 
    diye yardim istedi
    Biz de try-catch blogu ile IOException ile handle etmesini sagladik.
    
 */


	public static void main(String[] args) {
		  
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\TOSHIBA\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
            int k=0;
            try {
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) { //dosyalar ile ilgili genel yazma ve okuma sorunlarýný handle eder
				
				e.printStackTrace();
			}
        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("kod bloke olmamisss");
	}

}
