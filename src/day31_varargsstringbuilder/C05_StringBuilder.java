package day31_varargsstringbuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1: "+sb1);

		StringBuilder sb2 = new StringBuilder("Mehmet");
		System.out.println("sb2: "+sb2);
		
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println("sb3: "+sb3);
		
		sb1.append(" Hoca");
		System.out.println("append: "+sb1);
		
		sb2.append(" Hoca");
		System.out.println("append: "+sb2);
		
		sb3.append(" Hoca");
		System.out.println("append: "+sb3);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		

	}

}
