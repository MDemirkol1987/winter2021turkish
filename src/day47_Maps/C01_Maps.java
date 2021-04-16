package day47_Maps;

import java.util.HashMap;

public class C01_Maps {

	public static void main(String[] args) {

		HashMap<Integer,String> objeMap=new HashMap<>();
		
		objeMap.put(101,"Ali,Can,Java");
		objeMap.put(102,"Veli,Yan,Java");
		objeMap.put(103,"Ali,Yan,C#");
		
		System.out.println(objeMap);
	}

}
