package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		Integer sayi[]= {10,12,35,60,40};
		
		List<Integer> listArr=Arrays.asList(sayi);
		
		System.out.println(listArr);
		
		//array liste �evirdi�imizde uzunlu�u etkileyecek i�lemleri yapt�rmaz
		//ama i�erisinde de�i�iklik yapmada kolayl�k sa�lar.
		//Bu durumu daha �ok verilerin �ok oldu�u zamanlarda kullan�r�z.
		
		sayi[3]=43;
		System.out.println(Arrays.toString(sayi));
		
		listArr.set(2, 14);
		System.out.println(listArr);
		
	}

}
