package day34_Inheritance;

public class Muhasebe extends Personel {

	//muhasebe class personel clas�n�n child class� oldu�unu
	//declare etmek i�in class ismine extend keyword ile parent class� yazar�z.
	
	public int saatUcreti;
	public String stat�;
	public int maas;
	
	public int maasHesapla() {
		
		maas=30*8*saatUcreti;
		return maas;
		
	}
	
}
