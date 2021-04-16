package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		System.out.println(ll1.remove(0)); // remove index indexteki elemaný siler ve bize döndürür.
		
		System.out.println(ll1);
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		System.out.println(ll1.remove("B"));
		System.out.println(ll1);
		ll1.addFirst("B");
		ll1.add("A");
		System.out.println(ll1);
		System.out.println(ll1.removeFirstOccurrence("A"));
		ll1.removeFirstOccurrence("A");
		System.out.println(ll1);
	}

}
