package day12_StringManupulation2;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		//equalsIgnoreCase () method'u karþýlaþtýrdýðý Stringlere case sensitive 
		//(büyük küçük harf duyarlýlýðý olmadan bakar.
		//Stringler ayný ise true deðilse false doner.
		String str1="Ali Can";
		String str2="ali CAN";
		
		System.out.println(str1.equals(str2)); // false (büyük küçük harften kaynaklý)
		System.out.println(str1.equalsIgnoreCase(str2) ); //true (büyük küçük harf bakmaz)

	}

}
