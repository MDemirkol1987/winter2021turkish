package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// 
		
		
		
		
		
		int arr[] = {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		
		}/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/finally {
			System.out.println("Ne olursa olsun bu satir yaz�ls�n");
		}
		
		System.out.println("Kod bloke olmam�s");
		
		
		// Finally blogu try-catch blogu� ile veya sadece try blogu ile cal�sabilir
		// Finally blogu catch blogu ile ongordugum bir sorun oldugunda cal�st�g� gibi
		// ongoremed�g�m bir exception olsutugunda da cal�s�r
		
		
		
		
		
		/*
         * -Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir. 
         * -Try blogu sadece catch ile mi calisir ? Hayir, try blogundan sonra catch block veya blocklari , veya finally ile calisabilir.
         * -Finally block her durumda calisir.
         * -Neden kullaniriz ? Sadece yazi yazmak icin degil cloud veya database ile conection'i 
         * bitirme veya uzerinde calisilan dosyayi kapatma gibi islemler icin kullanilir.
         * -Finally block catch blogu olmadan sadece try ile de kullabilir.
         * -Bu durumda catch blogu olmadigindan Java throws exception ardindan finally ile istedigimiz islemi yapar.
         * 
         */
		
	}

}