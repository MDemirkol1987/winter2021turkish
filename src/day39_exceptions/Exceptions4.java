package day39_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions4 {

	public static void main(String[] args) {
		/*
		 * Eger handle edilecek exception'lar arasında parent-child iliskisi varsa
		 * bu durumda child exception icin catch blogu yazmasak da kodumuz calısır
		 * Child exception'i silmenin 
		 * pozitif yani: tek catch blogu ile tum exceptionlar handle edilebilir
		 * negatif yonu : bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi
	                        yoksa dosyaokunamadigi icin mi oldugu anlasilamaz
	​
		 */
		
			try {
				FileInputStream fis = new FileInputStream("C:\\Users\\TOSHIBA\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
				int k=0;
				
					while ((k=fis.read())!=-1) {
						System.out.print((char)k);
						fis.close();
					}
					
			}catch (IOException e) {
				
				
				System.out.println(e.getMessage()); 
			}
			System.out.println("");
			System.out.println("Kod bloke olmamıs");
			

		}


	}


