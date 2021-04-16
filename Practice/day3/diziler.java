package day3;

import java.util.Arrays;
import java.util.Iterator;

public class diziler {

	public static void main(String[] args) {
		
		String[] halisaha= {"Ahmet","Adem","Mustafa","Enis"};
		System.out.println(halisaha.length); // 4
		System.out.println(halisaha[1]); // Adem
		halisaha[3]="Selçuk"; 
		System.out.println(Arrays.toString(halisaha));//ahmet adem mustafa selçuk
		for (int i = 0; i < halisaha.length; i++) {
			System.out.print(halisaha[i]+ " ");
			
		}System.out.println();
		
		Arrays.sort(halisaha);
		System.out.println(Arrays.toString(halisaha)); //Adem Ahmet Mustafa Selçuk
		System.out.println(Arrays.binarySearch(halisaha, "Mustafa"));
		

	}

}
