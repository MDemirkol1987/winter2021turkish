package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		//her elemana B harfi ekleyelim
		
		for (String each : list) {
			each+="B";
			System.out.print(each+ " ");
		}
		System.out.println();
		System.out.println(list);
		
		
		//Collectionda hey yapý indexi desteklemez.Örneðin SET index olmaz.
		//index olmayýnca mecburen tüm elemanlara ulaþmak için for each loop kullanýlýr.
		//For each loop ile de update veya delete yapamayýz.
		//Bunun için java Iterator interface oluþturmuþtur.
		
		Iterator it1=list.iterator();
		// next(), hasNext(), remove() methodlarýna sahiptir.
		// Listedeki bütün elemanlarý Iterator kullanarak silelim.
		
		while (it1.hasNext()) {
	
			it1.next();
			it1.remove();
			
	
		}
		System.out.println(list);
		System.out.println(list.size());
		
		
		
	}

}
