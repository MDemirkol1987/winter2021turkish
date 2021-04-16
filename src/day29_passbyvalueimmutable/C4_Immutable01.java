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
		
		//Stringlerde method ile yaptýðýmýz deðiþiklikler kalýcý olmaz
		
		// banka dolar bozduruyorsun ama her þubede ayný indirim olsun  istemiyoruz sadece birinde olsun 
		//istiyoruz buna IMMUTABLE denir...
		
		
		List<String> isimList=new ArrayList<>();
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);//[Ali,Can]
		isimList.remove(1);
		System.out.println(isimList);//[Ali]
		
		//list lerde methodla yaptýðýmýz deðiþiklikler kalýcý olur
		//çünkü list mutable dýr.
		
		
		//bu ikisi arasýndaki kýyasa mutable veye immutable denir.

	}

}
