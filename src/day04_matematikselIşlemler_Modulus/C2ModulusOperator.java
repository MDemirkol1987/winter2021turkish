package day04_matematikselI�lemler_Modulus;

public class C2ModulusOperator {
	
	public static void main(String[] args) {
		
		//b�lme i�leminde kalan� verir
		//herhangi bir say�y� 2 ye b�lmek tek mi �ift mi oldu�unu verir.
		//25 i 3 e b�d���mde yine bir kal�r. yani sonu� olarak kalan 0 olmad��� s�rece b�l�nmez
		//yani bir say� di�er say�ya b�l�n�yor mu onu test ediyoruz.
		// modulus i�areti   %
		
		int kalan=15%4;
		System.out.println(kalan);
		System.out.println(26%8);
		
		//856 say�s�n�n birler basama�� nedir?
		int sayi = 856;
		int birlerBasamagi = sayi%10;
		System.out.println(birlerBasamagi);
		int onlarBasamagi=sayi/10;
		int onlarBasamagi2 = onlarBasamagi%10;
		System.out.println(onlarBasamagi2);
	
	
		
		
		
	}

}
