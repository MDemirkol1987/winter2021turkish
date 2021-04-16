package day37_overriding;

public class GeciciIsci extends Isci{
	
	public String clistigiBolum="Yemekhane";
	

	public static void main(String[] args) {
		// ***overriding tamamen methodlarla ilgilidir**
		
		// Overriding 
		// bir child class'da parent class'dan miras alýnan method'u
		// degistirmeye overriding denir
		
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
		
	}
	// overriding yapmak icin parent class'daki method signature'i
	// ile child class'da bir methýd olusturulur
	// signature ayni oldugundan sadece body degisir
	// boylece parent class'daki method child class icin gecersiz hale gelir
	public int maasHesapla() {
		
		return 30*8*10;
	}
	// annotation
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calýsýr");
	}
	
	// annotation : aciklama, dipnot
	// Java 29. satýrda kodu ýnceleyenler icin bir aciklama getiriyor
	
	// annotation olmasi ile olmamasý arasýndaki fark
	// annotation sadece bir acýklama degildir 
	// overwrite yaptýgýmýz method'u sürekli kontrol eder ve parent class'daki
	// overriden method signature'i degistirilirse CTE verdirir
	
	// eger override edilen parent class'daki method( overriden )'un da
	// calismasini istiyorsak overriding method'a super.overridenMethodIsmi yazarýz
	// eger overriding method'da super. yazýlmazsa 
	// overriden method calismaz. ( Constructor'dan farklý)
	
	// Access Modifier
	// Child Parent'i sýnýrlandýramaz
	// Yani overriding method'un access modifier'i overridden method'un access modifieer'indan 
	// daha dar olamaz
	
	
	// Return type
	// overriden method'un return type'i primitive veya void ise 
	// overriding method'un return type'ý da ayný olmalý
	// eger return type primitive degilse o zaman 
	// (overriding method'un return type'ý) IS-A (overriden method'un return type'ý) olmalidir

}