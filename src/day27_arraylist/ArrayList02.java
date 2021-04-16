package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		
		list.add("Hagi");
		list.add("Muslera");
		list.add("Onyekuru");
		list.add("Falcao");
		
		list.set(2,"Taylan"); //indexteki olaný deðiþtirir.
		System.out.println(list);
		
		list.add(1, "Onyekuru"); //indexe bunu ekler 
		System.out.println(list);
		
		System.out.println(list.contains("Muslera")); //içeriyor mu
		
		Collections.sort(list); //sýralama yapar
		System.out.println(list);
		
		
		
	}

}
