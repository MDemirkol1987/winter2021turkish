package day19_doWhileLoop;

import java.util.Scanner;

public class C02_Flag {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bir cümle yazýnýz:");
		String cumle= scan.nextLine();
		
		String flag="yok";
		
		int index=0;
		while(index<cumle.length()) {
			
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="var";
			}
		 index++;	
		}
		System.out.println(flag);
		
		
	}

}
