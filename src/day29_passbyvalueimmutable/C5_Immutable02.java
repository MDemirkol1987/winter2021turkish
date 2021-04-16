package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		//deðiþikliði kalýcý yapmak için atama yaparsak
		//immutable calasslar nasýl davranýr?
		
		String isim="Ali";
		isim=isim+"";
		System.out.println(isim.equals("Ali"));
		System.out.println(isim=="Ali");

		String str=new String("Mehmet");
		String str1=new String("Mehmet");
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		
		String str2="Mehmet";
		String str3="Mehmet";
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		
		
		
	}

}
