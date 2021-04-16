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
		
		
		//Collectionda hey yap� indexi desteklemez.�rne�in SET index olmaz.
		//index olmay�nca mecburen t�m elemanlara ula�mak i�in for each loop kullan�l�r.
		//For each loop ile de update veya delete yapamay�z.
		//Bunun i�in java Iterator interface olu�turmu�tur.
		
		Iterator it1=list.iterator();
		// next(), hasNext(), remove() methodlar�na sahiptir.
		// Listedeki b�t�n elemanlar� Iterator kullanarak silelim.
		
		while (it1.hasNext()) {
	
			it1.next();
			it1.remove();
			
	
		}
		System.out.println(list);
		System.out.println(list.size());
		
		
		
	}

}
