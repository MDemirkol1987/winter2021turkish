package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		
		ParametreliConstructer oto1=new ParametreliConstructer();
		System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazasiVarMi);
		
		ParametreliConstructer oto2=new ParametreliConstructer(2015);
		System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazasiVarMi);
		
		ParametreliConstructer oto3=new ParametreliConstructer("Toyota","Corolla",2010,true);
		System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazasiVarMi);
	}

}
