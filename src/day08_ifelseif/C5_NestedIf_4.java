package day08_ifelseif;

import java.util.Scanner;

public class C5_NestedIf_4 {

	public static void main(String[] args) {
		
		/*Soru 12) Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. 
		 * Girdi�i sayi 5�e b�l�n�yorsa  son rakam�n� kontrol edin. 
		 * Son rakam� 0 ise ekrana �5�e b�l�nen �ift say��  yazd�r�n. 
		 * Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n. 
		 * Girdi�i password  5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 4 Basamakl� Say� Giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%5==0 && sayi>=1000 && sayi<=9999) {
			if(sayi%10==0) {
				System.out.println("5'e B�l�nen �ift Say�");
			}else {
				System.out.println("5'e B�l�nen Tek Say�");
			}
		}
		else {
			System.out.println("Ge�erli Bir Sayi Giriniz");
		}
		}
		

	}


