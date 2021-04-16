package day25_Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		//verilen bir arrayda bir elemanýn var olup olmadýðýný nasýl kontrol ederiz.
		
		int arr[]= {10,25,3,16,75};
		int sayi=25;
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("içeriyo");
		}else {
			System.out.println("içermiyo");
		}
		
		Arrays.sort(arr);
		Arrays.binarySearch(arr, sayi); //[3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, sayi));
		System.out.println(Arrays.binarySearch(arr, 28));//tahmini olacaðý yeri raka ile gösterir negatif olmasý olmadýðýný gösterr.
		
	}

}
