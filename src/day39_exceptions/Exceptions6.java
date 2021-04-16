package day39_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions6 {

	public static void main(String[] args) {
		// List ve Array'de var olmayan bir index ile islem yapmak �stersen�z 
				// Java IndexOutOfBoundsException verir
				
				int arr[] = {1,2,5,6};
				
				System.out.println(arr[1]); //2
				System.out.println(arr[3]); //6
				//System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
				
				List<String> list = new ArrayList<>();
				list.add("Bahattin");
				list.add("Kaz�m");
				list.add("Celi");
				System.out.println(list);
				System.out.println(list.get(1));//Kaz�m
				System.out.println(list.get(3)); // IndexOutOfBoundsException
				


	}

}
