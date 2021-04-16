package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("Can");
		System.out.println(isim); //Ali
		System.out.println(isim.concat("Can"));//AliCan
		System.out.println(isim);//Ali
		
		//Stringlerde method ile yapt���m�z de�i�iklikler kal�c� olmaz
		
		// banka dolar bozduruyorsun ama her �ubede ayn� indirim olsun  istemiyoruz sadece birinde olsun 
		//istiyoruz buna IMMUTABLE denir...
		
		
		List<String> isimList=new ArrayList<>();
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);//[Ali,Can]
		isimList.remove(1);
		System.out.println(isimList);//[Ali]
		
		//list lerde methodla yapt���m�z de�i�iklikler kal�c� olur
		//��nk� list mutable d�r.
		
		
		//bu ikisi aras�ndaki k�yasa mutable veye immutable denir.

	}

}
