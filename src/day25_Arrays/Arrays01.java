package day25_Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		//verilen bir arrayda bir eleman�n var olup olmad���n� nas�l kontrol ederiz.
		
		int arr[]= {10,25,3,16,75};
		int sayi=25;
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("i�eriyo");
		}else {
			System.out.println("i�ermiyo");
		}
		
		Arrays.sort(arr);
		Arrays.binarySearch(arr, sayi); //[3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, sayi));
		System.out.println(Arrays.binarySearch(arr, 28));//tahmini olaca�� yeri raka ile g�sterir negatif olmas� olmad���n� g�sterr.
		
	}

}
