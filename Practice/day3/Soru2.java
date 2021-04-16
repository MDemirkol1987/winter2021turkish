package day3;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bir sayý giriniz:");
		int num=scan.nextInt();
		
		if (num<0) {
			System.out.println(num*(-1));
		}else if (num>0) {
			System.out.println(num);
		}else {
			System.out.println("lütfen sýfýr girmyiniz!!!");
		}
	}

}
