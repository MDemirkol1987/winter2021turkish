package day45_collections;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("Y");
		set1.add("A");
		System.out.println(set1);
		
		System.out.println(set1.hashCode());
		set1.add("M");
		set1.add("E");
		System.out.println(set1);
		
		System.out.println(set1.hashCode());
		
		// Sette �nemli olan konu no dublication ve eleman�n k�mede var olup olmamas�d�r.
		// S�ralama set i�in �nemli de�ildir
		// set i�in elemanlar� girdi�imiz s�rada verir veya elemanlar� natural s�ralama ile verir
		// gibi bir c�mle kullanamay�z.
		
		
		
		
		
	}

}
