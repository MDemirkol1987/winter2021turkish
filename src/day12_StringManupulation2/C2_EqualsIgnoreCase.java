package day12_StringManupulation2;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		//equalsIgnoreCase () method'u kar��la�t�rd��� Stringlere case sensitive 
		//(b�y�k k���k harf duyarl�l��� olmadan bakar.
		//Stringler ayn� ise true de�ilse false doner.
		String str1="Ali Can";
		String str2="ali CAN";
		
		System.out.println(str1.equals(str2)); // false (b�y�k k���k harften kaynakl�)
		System.out.println(str1.equalsIgnoreCase(str2) ); //true (b�y�k k���k harf bakmaz)

	}

}
