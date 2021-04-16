package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		Integer sayi[]= {10,12,35,60,40};
		
		List<Integer> listArr=Arrays.asList(sayi);
		
		System.out.println(listArr);
		
		//array liste çevirdiðimizde uzunluðu etkileyecek iþlemleri yaptýrmaz
		//ama içerisinde deðiþiklik yapmada kolaylýk saðlar.
		//Bu durumu daha çok verilerin çok olduðu zamanlarda kullanýrýz.
		
		sayi[3]=43;
		System.out.println(Arrays.toString(sayi));
		
		listArr.set(2, 14);
		System.out.println(listArr);
		
	}

}
