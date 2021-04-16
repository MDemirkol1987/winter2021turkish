package day31_varargsstringbuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		toplama(2,5);
		toplama(3,5,7,8,12,5,5);
		toplama(1,5,3,8,0);
		

	}

	public static void toplama(int... i) {
		System.out.println();
		int toplam=0;
		for(int j:i) {
				
			toplam+=j;
			
		}System.out.println("toplam : "+ toplam);
		
	}

}
