package day09_ternary;

public class C01_Ternary1 {

	public static void main(String[] args) {
		
		int sayi=101;
		
		//ternary iþlemi bir sonuç döndürðünden bir variable oluþturup ona assign etmeliyiz.
		
		String sonuc = sayi%2==0 ? "çift sayi" : "tek sayi" ;
		System.out.println(sonuc);

		
		//ben bir sayý assign etmek istemezsem 
		System.out.println(sayi%2==0 ? "çift sayi" : "tek sayi");
		
		int y=1;
		int z=1;
		int a= y<10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);
		
	}

}
