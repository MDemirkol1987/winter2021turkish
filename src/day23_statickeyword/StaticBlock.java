package day23_statickeyword;

public class StaticBlock {

	//static blok class çalýþtýrýldýðýnda ilk olarak çalýþýr 
	//(main method=javanýn çalýþmaya baþladýðý noktadýr ama static blok ondan da önce çalýþýr)
	static String isim;
	
	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	static {
		System.out.println("2. blok çalýþtý");
	}
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		

	}

}
