package day25_Arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//Verilen bir Stringi Arraya nas�l �eviririz?
		//Verilen c�mlede ka� kelime var
		//verilen c�mlede her kelimenin ilk harfini b�y�k yap�n�z?
		
        
        String str="Herkes Javayi tanisa severdi";
        // bu stringi kelimelere ayiralim
        // split methodu
        
        String arr[]=str.split(" ");
        
        System.out.println(Arrays.toString(arr));
        
        String arr2[]=str.split("Java");
        System.out.println(Arrays.toString(arr2)); 
        
        String arr3[]=str.split("a");
        System.out.println(Arrays.toString(arr3)); 
        String arr4[]=str.split("");
        System.out.println(Arrays.toString(arr4)); 

	}

}
