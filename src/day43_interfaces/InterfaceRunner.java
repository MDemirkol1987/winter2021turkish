package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanımlanmış bir variable ve method
		// baska class'dan classIsmi.methodIsmi şeklinde çağrılabilir.
		
		Interface02.deneme2();
		
		// Default keyword ile oluşturduğumuz method ise obje üzerinden çağırılabilir.
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
		
	}

}
