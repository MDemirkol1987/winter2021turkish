package day19_doWhileLoop;

import java.util.Scanner;

public class C01_Count {

	public static void main(String[] args) {
		// Kullan�c�dan bir c�mle ve bir harf isteyin 
		//While loop kullanarak c�mlenen istenen harf ka� kez kullan�lm�� bulun
		//case sensetive olsun
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen bir c�mle giriniz;");
		String cumle=scan.nextLine();
		System.out.println("istenilen harfi giriniz:");
		String harf=scan.next().substring(0, 1);
		
		int count=0;
		int index=0;
		
		while (index<=cumle.length()-1) {
			
			if(cumle.subSequence(index, index+1).equals(harf)) {
				count++;
			}
			index++;
		}
	
		
		System.out.println("C�mledeki " + harf+ " harfi "+count +" defa kullan�lm��");
	}

}
