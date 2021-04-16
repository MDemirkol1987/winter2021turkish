package day3;

public class kumsaati {
public static void main(String[] args) {
	int x =9;
	for (int i=0;i<5;i++) {
		for(int j=i;j>0;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<x;k++) {
			System.out.print("*");
		}
		x-=2;
		System.out.println(" ");
	}
	x=3;
	for (int i=1;i<5;i++) {
		for(int j=i;j<4;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<x;k++) {
			System.out.print("*");
		}
		x+=2;
		System.out.println(" ");
	}
	
}
}
