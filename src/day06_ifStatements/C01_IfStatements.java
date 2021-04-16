package day06_ifStatements;

public class C01_IfStatements {

	public static void main(String[] args) {
	
		int a=10;
		int b=8;
		
		if (a>b) {
			System.out.println("ilk sayi  büyük");
		}
		
		if (a<b || b>0) {
			System.out.println("or'lu cümle caliþti");
		}
		
		if (a-b>0 && a*b>0) {
			System.out.println("and'li cümle çalýþtý");
		}
	}

}
