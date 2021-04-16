package day08_ifelseif;

import java.util.Scanner;

public class C5_NestedIf_4 {

	public static void main(String[] args) {
		
		/*Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		 * Girdiği sayi 5’e bölünüyorsa  son rakamını kontrol edin. 
		 * Son rakamı 0 ise ekrana “5’e bölünen çift sayı”  yazdırın. 
		 * Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
		 * Girdiği password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 Basamaklı Sayı Giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%5==0 && sayi>=1000 && sayi<=9999) {
			if(sayi%10==0) {
				System.out.println("5'e Bölünen Çift Sayı");
			}else {
				System.out.println("5'e Bölünen Tek Sayı");
			}
		}
		else {
			System.out.println("Geçerli Bir Sayi Giriniz");
		}
		}
		

	}


