package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("uzunluk girin");
		int uzunluk=scan.nextInt();
		System.out.println("en giriniz");
		int en=scan.nextInt();
		
		System.out.println(uzunluk>0 && en>0?(uzunluk!=en?"dikdörtgen":"kare"):("geçerli sayý giriniz"));
		
		scan.close();
		
	}

}
