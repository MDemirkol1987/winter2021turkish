package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1=new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		obj1.setOkul�smi("Enis Koleji");  //obj 1 i�in okul ismini de�i�tirdik yeni obje a��l�rsa ilk de�erleri al�r
		System.out.println(obj1.getOkulIsmi()); // obj1 i�in atama oldu�u i�in enis koleji olur
		
		Encapsulation obj2=new Encapsulation();
		System.out.println(obj2.getOkulIsmi()); //ilk de�er y�ld�z kolaji
		
	}

}
