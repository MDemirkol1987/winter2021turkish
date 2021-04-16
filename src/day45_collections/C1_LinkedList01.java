package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// Link baðlý demektir.
		// Link list'te tum elemanlar tren gibi birbirine baðlýdýr.
		
		//Collectionsta obje oluþtururken oluþturmak istediðimiz collectionnýn class mý yoksa interface mi
		//olduðuna bakmalýyýz.eðer oluþturmak istediðimiz collection interface ise 
		//data türü olarak o interface, constructor olarak ise uygun bir class seçmeliyiz.
		// Þimdiye kadar List(interface) oluþtururken constructer olarak ArrayLisdt seçiypruz.
		
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
		
		// LinkedList interface olan queue ve List interfacelerine implement ile child olduðu için 
		// her ikisindeki methodlarý override etmek zorundadýr.
		// iþlev olarak ayný iþi yapan addLast() ve addFirst() Queue dan inherit edilmiþtir.
		
		// ben bir linkedList oluþturmak istiyorum ama sadece List özelliklerini alsýn 
		
		List<String> list=new LinkedList<>();
		list.add("Sadece Listten gelen özellikler");
		
		// ben bir linkedList oluþturmak istiyorum ama sadece Queue özelliklerini alsýn 
		
		Queue <String> list1=new LinkedList<>();
		list1.add("Sadece Queue gelen özellikler");
		
	}

}
