package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1=new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		obj1.setOkulÝsmi("Enis Koleji");  //obj 1 için okul ismini deðiþtirdik yeni obje açýlýrsa ilk deðerleri alýr
		System.out.println(obj1.getOkulIsmi()); // obj1 için atama olduðu için enis koleji olur
		
		Encapsulation obj2=new Encapsulation();
		System.out.println(obj2.getOkulIsmi()); //ilk deðer yýldýz kolaji
		
	}

}
