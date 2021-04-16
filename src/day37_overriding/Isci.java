package day37_overriding;


	public class Isci extends Personel {
		
		public String bolum="Kaynk Atolyesi";
		public int maas=5000;
		public String isim="Mesut";
		
		
		
		
		protected int maasHesapla() {
			return 30*8*15; // 30 gun say�s�, 8 gunluk mesai, 15 saat ucreti
		}
		
		public void mesai() {
			
			System.out.println("Isc�ler gunluk 8 saat cal�s�r");
		}
		
		
		// overloading : Ayn� isimde ama farkl� method signature'lar�na sahip method'lar
		
		public int maasHesapla(int gunSayisi) {
			
			return gunSayisi*8*15;
		}
		
		public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) {
			return gunSayisi*gunlukCalismaSaati*15;
			
		}
		
		public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {
			return gunSayisi*gunlukCalismaSaati*saatUcreti;
			
		}

}
