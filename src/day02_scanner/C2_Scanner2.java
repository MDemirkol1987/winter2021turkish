package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		double pi=3.14;
			Scanner scan=new Scanner(System.in);
			System.out.print("Dairenin yaricapini girin=");
			double kenar=scan.nextDouble();
			double alan=kenar*kenar;
			System.out.println("Sonuc="+alan*pi+"m2");
	}

}
