package day31_varargsstringbuilder;

public class C03_Varargs1 {

	public static void main(String[] args) {
		
		toplama(2,5);
		toplama(3,5,7,8,12,5,5);
		toplama(1,5,3,8,0);

	}
	public static void toplama(int sayi,int... i) { //ilk sayýyý alýr gerisini varargs içine alýr
		
		System.out.println("ilk sayi: "+sayi);
		
		int toplam=0;
		for(int each:i) {
			toplam+=each;
			
		}System.out.println(sayi*toplam);

}
}
