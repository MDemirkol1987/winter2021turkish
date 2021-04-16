package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C04_Varargs2 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		//varargs esnek oldu�u i�in liste benzese bile list de�ildir.
		
		int arr[]= {2,4,5,6};
		toplama(arr);
		

	}
	public static void toplama(int... i) { //ilk say�y� al�r gerisini varargs i�ine al�r
		
		int toplam=0;
		for(int each:i) {
			toplam+=each;
			
		}System.out.println(toplam);


}
}