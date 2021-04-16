package day28_foreachloop;

public class C01ForEachLoop {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10};
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		 								//For each Loop
		for(int w : arr) {
			System.out.print(w +" ");
		}

	}

}
