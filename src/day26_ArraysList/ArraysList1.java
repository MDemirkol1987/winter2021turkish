package day26_ArraysList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysList1 {

	public static void main(String[] args) {
		// arrayList bir objedir,dolayýsýyla yeni bir tane oluþturmak için new keyword yazmalýyýz.
		
		ArrayList<String> list=new ArrayList<String>();
		
		
		ArrayList<String> lsit2=new ArrayList<>();
		
		
		List<String> list3=new ArrayList<>(); //en çok bu kullanýlýyor!!!!
		
		
		
		//Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir 
				//Array olarak yazdiran bir method yaziniz
			
					int arr[]=  {2,3,5,3,6,4,3,6,7};
				
			        int sayi=5;
			        
			        List<Integer> istenenList=new ArrayList<>();
			        
			        for(int i=0;i<arr.length;i++) {
			        	if (arr[i]!=sayi) {
			        		
			        		istenenList.add(arr[i]);
							
						}
			        }System.out.println(istenenList);
			        
	
	}

}
