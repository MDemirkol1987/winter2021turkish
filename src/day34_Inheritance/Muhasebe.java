package day34_Inheritance;

public class Muhasebe extends Personel {

	//muhasebe class personel clasýnýn child classý olduðunu
	//declare etmek için class ismine extend keyword ile parent classý yazarýz.
	
	public int saatUcreti;
	public String statü;
	public int maas;
	
	public int maasHesapla() {
		
		maas=30*8*saatUcreti;
		return maas;
		
	}
	
}
