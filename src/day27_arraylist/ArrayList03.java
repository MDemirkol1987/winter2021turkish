package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		//kullan�c�dan poziitf b�r tam say� al�n�z
		//ald���n�z say�dan k���k olan fibonacci dizsi elemanlaar�n� yaz�n�z.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Ltfen Pozitif Tam Say� Giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		System.out.println(	fibo.get(0) + fibo.get(1)); //2
		
		for(int i = 2; fibo.get(i-2)+fibo.get(i-1)<sayi; i++) {
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			
		}
		System.out.println(fibo);
		

	}

}
