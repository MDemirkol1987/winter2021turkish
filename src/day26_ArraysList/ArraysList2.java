package day26_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysList2 {

	public static void main(String[] args) {
		
		//List uzunlu�u nas�l bulunur
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		//bir eleman nas�l silinir
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		
		List<String> list2=new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("hasan"));
		System.out.println(list2);
		System.out.println(list2.remove("Ali"));
		
		//Remove (Object) methodu kullan�ld���nda e�er java istenen eleman� bulup remove ederse 
		//bize remove edilen eleman� d�nd�r�r.Listede bulamazsa iste�in yerine getirilemedi�ini 
		//anlamam�z i�in FALSE d�nd�r�r...
		
		
		
		
		
		
	}

}
