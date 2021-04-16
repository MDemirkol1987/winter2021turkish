package day37_overriding;

public class GeciciIsci extends Isci{
	
	public String clistigiBolum="Yemekhane";
	

	public static void main(String[] args) {
		// ***overriding tamamen methodlarla ilgilidir**
		
		// Overriding 
		// bir child class'da parent class'dan miras al�nan method'u
		// degistirmeye overriding denir
		
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
		
	}
	// overriding yapmak icin parent class'daki method signature'i
	// ile child class'da bir meth�d olusturulur
	// signature ayni oldugundan sadece body degisir
	// boylece parent class'daki method child class icin gecersiz hale gelir
	public int maasHesapla() {
		
		return 30*8*10;
	}
	// annotation
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat cal�s�r");
	}
	
	// annotation : aciklama, dipnot
	// Java 29. sat�rda kodu �nceleyenler icin bir aciklama getiriyor
	
	// annotation olmasi ile olmamas� aras�ndaki fark
	// annotation sadece bir ac�klama degildir 
	// overwrite yapt�g�m�z method'u s�rekli kontrol eder ve parent class'daki
	// overriden method signature'i degistirilirse CTE verdirir
	
	// eger override edilen parent class'daki method( overriden )'un da
	// calismasini istiyorsak overriding method'a super.overridenMethodIsmi yazar�z
	// eger overriding method'da super. yaz�lmazsa 
	// overriden method calismaz. ( Constructor'dan farkl�)
	
	// Access Modifier
	// Child Parent'i s�n�rland�ramaz
	// Yani overriding method'un access modifier'i overridden method'un access modifieer'indan 
	// daha dar olamaz
	
	
	// Return type
	// overriden method'un return type'i primitive veya void ise 
	// overriding method'un return type'� da ayn� olmal�
	// eger return type primitive degilse o zaman 
	// (overriding method'un return type'�) IS-A (overriden method'un return type'�) olmalidir

}