package day37_overriding;

public class Formen extends Isci {
    
    
    public String sorumluOldBolum="bakim";
    public String isim="Emrullah";
    public static void main(String[] args) {
        
        
        //  Inheritance'da data turu olarak class ismi kullan�m�
        
        // Bir class'da obje uretirken data turu olarak class'�n kendisini 
        // veya parent'lar�n� kullanabiliriz
        // Olusturdugumuz obje ile variable kullanmam�z gerek�rse, hangi degeri 
        // alacag�n� anlamak �c�n �nce data turu olan class'a gideriz
        // orada arad�g�m�z variable varsa kullan�r�z, yoksa
        // parent(lar)�na bakar�z, yukar� dogru giderken ilk buldugumuz degeri kullan�r�z
        Formen fr1 = new Formen();
        // fr1 objesini kullanarak hangi class'lar�n variable'lar�n� gorebilirim
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

