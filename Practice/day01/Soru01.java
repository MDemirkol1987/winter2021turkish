package day01;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/* Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
		 * gosterin ve birini secmeleri isteyin.
		 * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Bir Say� Se�iniz:");
		double sayi1=scan.nextDouble();
		System.out.println("L�tfen �kinci Say�y� Se�iniz:");
		double sayi2=scan.nextDouble();
		
		System.out.println("L�tfen D�rt ��lemden Birini Se�iniz \n1. Toplama \n2. ��karma \n3. �arpma \n4. B�lme");
		
		int se�im=scan.nextInt();
		
		if(se�im==1) {
			System.out.println(sayi1+sayi2);
		}else if (se�im==2){
			System.out.println(sayi1-sayi2);
		}else if (se�im==3) {
			System.out.println(sayi1*sayi2);
		}else if (se�im==4){
			System.out.println(sayi1/sayi2);		
		}else {
			System.out.println("Yanl�� Giri� Yapt�n�z");
		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}
