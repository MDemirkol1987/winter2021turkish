package day01;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/* Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
		 * gosterin ve birini secmeleri isteyin.
		 * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Bir Sayý Seçiniz:");
		double sayi1=scan.nextDouble();
		System.out.println("Lütfen Ýkinci Sayýyý Seçiniz:");
		double sayi2=scan.nextDouble();
		
		System.out.println("Lütfen Dört Ýþlemden Birini Seçiniz \n1. Toplama \n2. Çýkarma \n3. Çarpma \n4. Bölme");
		
		int seçim=scan.nextInt();
		
		if(seçim==1) {
			System.out.println(sayi1+sayi2);
		}else if (seçim==2){
			System.out.println(sayi1-sayi2);
		}else if (seçim==3) {
			System.out.println(sayi1*sayi2);
		}else if (seçim==4){
			System.out.println(sayi1/sayi2);		
		}else {
			System.out.println("Yanlýþ Giriþ Yaptýnýz");
		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}
