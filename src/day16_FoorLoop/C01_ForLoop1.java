package day16_FoorLoop;

public class C01_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa hello world yazalým.
		
		
		//tüm looplarda 3 þey yazýlmak zorunda.
		//1- Baþlangýç deðeri
		//2- kaça kadar gidecek yani bitiþ deðeri
		//3- kaçar kaçar sayacaðým artýþ deðeri
		
		
		for(int i=1; i<=5 ; i++) {
			System.out.println("Hello World");
		}
		for ( int i = 400; i>300;i-=10) {
			System.out.println("say");
		}
	     // Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
        // Not : loop'da artis degeri pozitif oldugu gibi negatif de olabilir i--
        // Not : Artis degeri 1 olmak zorunda degil, farkli da olabilir
        // Not : Eger Loop'un sarti hic true olmazsa loop body hic devreye girmez
			

	}

}
