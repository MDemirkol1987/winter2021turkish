package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanýmlanmýþ bir variable ve method
		// baska class'dan classIsmi.methodIsmi þeklinde çaðrýlabilir.
		
		Interface02.deneme2();
		
		// Default keyword ile oluþturduðumuz method ise obje üzerinden çaðýrýlabilir.
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
		
	}

}
