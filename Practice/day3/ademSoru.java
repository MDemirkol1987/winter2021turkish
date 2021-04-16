package day3;

import java.util.Arrays;

public class ademSoru {

	public static void main(String[] args) {
		/*    Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
        {3,4,5}, {6} } ve arr2 =  {{7,8,9}, {10,11}, {12} }
        */
		
		int[][] arr1={{1,2},{3,4,5},{6}};
		int[][] arr2={{7,8,9},{10,11},{12}};
		
		int toplam1=0;
		int toplam2=0;
		int toplam3=0;
		
		for (int i = 0; i<=1; i++) {
			
			toplam1=toplam1+arr1[0][i]+arr2[0][i];	
		}
		System.out.println(toplam1);
		
		for (int j = 0; j<=1; j++) {
			
			toplam2=toplam2+arr1[1][j]+arr2[1][j];	
		}
		System.out.println(toplam2);
		
		for (int k = 0; k<1; k++) {
			
			toplam3=toplam3+arr1[2][k]+arr2[2][k];	
		}
		System.out.println(toplam3);
		
		int [] yeniArray= {toplam1,toplam2,toplam3};
		System.out.println(Arrays.toString(yeniArray));
	}

}
