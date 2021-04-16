package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {

	public static void main(String[] args) {
		
		//verilen tüm elemanlarý bir listeye aktaran method yaz
		
		int arr[]= {2,4,6,8,10};
		
		List<Integer> list= ListeyeCevir(arr);
		
		System.out.println(list);
		
	}

	private static List<Integer> ListeyeCevir(int[] arr) {
		
		List<Integer> geciciList=new ArrayList<>();
		for(int w:arr) {
			
			geciciList.add(w);
			
		}
		return geciciList;
	}

}
