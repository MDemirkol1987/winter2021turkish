package day37_overriding;

public class Formen extends Isci {
    
    
    public String sorumluOldBolum="bakim";
    public String isim="Emrullah";
    public static void main(String[] args) {
        
        
        //  Inheritance'da data turu olarak class ismi kullanýmý
        
        // Bir class'da obje uretirken data turu olarak class'ýn kendisini 
        // veya parent'larýný kullanabiliriz
        // Olusturdugumuz obje ile variable kullanmamýz gerekýrse, hangi degeri 
        // alacagýný anlamak ýcýn önce data turu olan class'a gideriz
        // orada aradýgýmýz variable varsa kullanýrýz, yoksa
        // parent(lar)ýna bakarýz, yukarý dogru giderken ilk buldugumuz degeri kullanýrýz
        Formen fr1 = new Formen();
        // fr1 objesini kullanarak hangi class'larýn variable'larýný gorebilirim
        fr1.sorumluOldBolum="Marangozhane";
        fr1.maas=1000;
        System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas);
        //Emrullah Marangozhane 1000
        Isci fr2 = new Formen();
        // Data turu olarak Isci secildigi icin
        fr2.bolum="Kaynak Atolyesi";
        
        System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
        // Mesut Kaynak Atolyesi 5000
        
        
        Personel fr3 = new Formen();
        System.out.println(fr3.isim); // Emre
        
        
    }
}

