package day08_ifelseif;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		/*Eðer çalýþan kadýnsa 60 yaþýndan büyük eðer erkekse 65 büyük olunca emekli olabiliri. 
		 */
		String cinsiyet="Erkek";
		int yas= 90;
		
		if (yas<0) {
			System.out.println("Yaþ Negati Olamaz");
		}else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("Emekli");
		}else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("Emekli Deðil");
		}else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>=60) {
			System.out.println("Emekli");
		}else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
			System.out.println("Emekli Deðil");
		}else {
			System.out.println("Cinsiyet veya Yaþ tanýmsýz");
		}
		
		System.out.println("Nested if ile sonuç");
		
		if(cinsiyet.equalsIgnoreCase("erkek")) {
			if(yas<0) {
				System.out.println("Negatif deðer girmeyiniz");
			}else if (yas<65) {
				System.out.println("Emekli Olamazsýnýz");
			}else {
				System.out.println("Emekli Olabilirsiniz");
			}
		}
		if(cinsiyet.equalsIgnoreCase("kadin")) {
			if(yas<0) {
				System.out.println("Negatif deðer girmeyiniz");
			}else if (yas<60) {
				System.out.println("Emekli Olamazsýnýz");
			}else {
				System.out.println("Emekli Olabilirsiniz");
			}
		}
		
	}
}
