package day04_matematikselI�lemler_Modulus;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		//ussel i�lemler 
		//�arpma b�lme yanyana olursa ilk soldakini yapar
		//toplama ��karma "			"		"		"
		
		int num = 38 /2 * (4+3) * 2;
		System.out.println(num);
		
		int num2 = 8+2*(14-6/2)-12;
		System.out.println(num2);
		
		double num3=num/num2;  //i�lemler int oldu�undan dolay� virgulden sonraki k�sm� at�yor 
		System.out.println(num3);
		 
		double num4 = (double) (num/num3/num2); //double olarak kalmas�n� isteyerek sorumluluk ald�k
		System.out.println(num4);
		

	}

}
