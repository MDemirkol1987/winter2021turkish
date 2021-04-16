package day14_MethodCreation;

public class C03_MethodCreation3 {

	public static void main(String[] args) {

		ortalama(33, 43, 54);

	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println("ortalama:" + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {
	        
	System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		
	}	
}
