package day29_passbyvalueimmutable;

import java.util.Iterator;

public class C06_Immutable03 {

	public static void main(String[] args) {
		// atama yapýldýðýnda ne olur ?
		
		String isim="";
		
		for (int i = 0; i < 10; i++) {
			
			isim=isim+i;
			System.out.println(isim);
		}		
		System.out.println("======");
		System.out.println(isim);
	}

}
