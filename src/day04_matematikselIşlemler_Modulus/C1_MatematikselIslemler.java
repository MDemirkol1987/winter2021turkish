package day04_matematikselIþlemler_Modulus;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		//ussel iþlemler 
		//çarpma bölme yanyana olursa ilk soldakini yapar
		//toplama çýkarma "			"		"		"
		
		int num = 38 /2 * (4+3) * 2;
		System.out.println(num);
		
		int num2 = 8+2*(14-6/2)-12;
		System.out.println(num2);
		
		double num3=num/num2;  //iþlemler int olduðundan dolayý virgulden sonraki kýsmý atýyor 
		System.out.println(num3);
		 
		double num4 = (double) (num/num3/num2); //double olarak kalmasýný isteyerek sorumluluk aldýk
		System.out.println(num4);
		

	}

}
