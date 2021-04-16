package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// Link ba�l� demektir.
		// Link list'te tum elemanlar tren gibi birbirine ba�l�d�r.
		
		//Collectionsta obje olu�tururken olu�turmak istedi�imiz collectionn�n class m� yoksa interface mi
		//oldu�una bakmal�y�z.e�er olu�turmak istedi�imiz collection interface ise 
		//data t�r� olarak o interface, constructor olarak ise uygun bir class se�meliyiz.
		// �imdiye kadar List(interface) olu�tururken constructer olarak ArrayLisdt se�iypruz.
		
		List<String> liste=new ArrayList<>();
		liste.add("X");
		liste.add("Y");
		
		
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		ll1.add(1, "C");
		System.out.println(ll1);
		ll1.addAll(liste);
		System.out.println(ll1);
		ll1.addAll(2, liste);
		System.out.println(ll1);
		ll1.add("K");
		System.out.println(ll1);
		
		// LinkedList interface olan queue ve List interfacelerine implement ile child oldu�u i�in 
		// her ikisindeki methodlar� override etmek zorundad�r.
		// i�lev olarak ayn� i�i yapan addLast() ve addFirst() Queue dan inherit edilmi�tir.
		
		// ben bir linkedList olu�turmak istiyorum ama sadece List �zelliklerini als�n 
		
		List<String> list=new LinkedList<>();
		list.add("Sadece Listten gelen �zellikler");
		
		// ben bir linkedList olu�turmak istiyorum ama sadece Queue �zelliklerini als�n 
		
		Queue <String> list1=new LinkedList<>();
		list1.add("Sadece Queue gelen �zellikler");
		
	}

}
