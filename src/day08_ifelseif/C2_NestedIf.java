package day08_ifelseif;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		/*E�er �al��an kad�nsa 60 ya��ndan b�y�k e�er erkekse 65 b�y�k olunca emekli olabiliri. 
		 */
		String cinsiyet="Erkek";
		int yas= 90;
		
		if (yas<0) {
			System.out.println("Ya� Negati Olamaz");
		}else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("Emekli");
		}else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("Emekli De�il");
		}else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>=60) {
			System.out.println("Emekli");
		}else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
			System.out.println("Emekli De�il");
		}else {
			System.out.println("Cinsiyet veya Ya� tan�ms�z");
		}
		
		System.out.println("Nested if ile sonu�");
		
		if(cinsiyet.equalsIgnoreCase("erkek")) {
			if(yas<0) {
				System.out.println("Negatif de�er girmeyiniz");
			}else if (yas<65) {
				System.out.println("Emekli Olamazs�n�z");
			}else {
				System.out.println("Emekli Olabilirsiniz");
			}
		}
		if(cinsiyet.equalsIgnoreCase("kadin")) {
			if(yas<0) {
				System.out.println("Negatif de�er girmeyiniz");
			}else if (yas<60) {
				System.out.println("Emekli Olamazs�n�z");
			}else {
				System.out.println("Emekli Olabilirsiniz");
			}
		}
		
	}
}
