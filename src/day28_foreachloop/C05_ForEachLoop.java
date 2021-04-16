package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		int toplam=0;
		for (int w:list) {
			
			toplam=toplam+(w*w);
			
		}
		System.out.println(toplam);
	}

}
