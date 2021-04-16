package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C04_Varargs2 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		//varargs esnek olduðu için liste benzese bile list deðildir.
		
		int arr[]= {2,4,5,6};
		toplama(arr);
		

	}
	public static void toplama(int... i) { //ilk sayýyý alýr gerisini varargs içine alýr
		
		int toplam=0;
		for(int each:i) {
			toplam+=each;
			
		}System.out.println(toplam);


}
}