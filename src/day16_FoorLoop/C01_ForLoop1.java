package day16_FoorLoop;

public class C01_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa hello world yazal�m.
		
		
		//t�m looplarda 3 �ey yaz�lmak zorunda.
		//1- Ba�lang�� de�eri
		//2- ka�a kadar gidecek yani biti� de�eri
		//3- ka�ar ka�ar sayaca��m art�� de�eri
		
		
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
