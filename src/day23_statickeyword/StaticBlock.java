package day23_statickeyword;

public class StaticBlock {

	//static blok class �al��t�r�ld���nda ilk olarak �al���r 
	//(main method=javan�n �al��maya ba�lad��� noktad�r ama static blok ondan da �nce �al���r)
	static String isim;
	
	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	static {
		System.out.println("2. blok �al��t�");
	}
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		

	}

}
