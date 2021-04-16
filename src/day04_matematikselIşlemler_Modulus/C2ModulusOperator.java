package day04_matematikselIþlemler_Modulus;

public class C2ModulusOperator {
	
	public static void main(String[] args) {
		
		//bölme iþleminde kalaný verir
		//herhangi bir sayýyý 2 ye bölmek tek mi çift mi olduðunu verir.
		//25 i 3 e bödüðümde yine bir kalýr. yani sonuç olarak kalan 0 olmadýðý sürece bölünmez
		//yani bir sayý diðer sayýya bölünüyor mu onu test ediyoruz.
		// modulus iþareti   %
		
		int kalan=15%4;
		System.out.println(kalan);
		System.out.println(26%8);
		
		//856 sayýsýnýn birler basamaðý nedir?
		int sayi = 856;
		int birlerBasamagi = sayi%10;
		System.out.println(birlerBasamagi);
		int onlarBasamagi=sayi/10;
		int onlarBasamagi2 = onlarBasamagi%10;
		System.out.println(onlarBasamagi2);
	
	
		
		
		
	}

}
