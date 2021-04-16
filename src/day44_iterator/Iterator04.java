package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		
		
		List<Integer> sayiListesi=new ArrayList<>();
		
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);
		
		ListIterator it=sayiListesi.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		
		while (it.hasPrevious()) {
			
			System.out.print(it.previous()+" ");
			
		}
		

	}

}
