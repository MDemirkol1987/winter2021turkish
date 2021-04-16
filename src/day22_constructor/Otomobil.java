package day22_constructor;

	
public class Otomobil {
	
	public Otomobil(String renk) { //istersek constructor parametreli olarak oluþturabilir.
		
	}
    
	//biz bir contructor oluþturduðumuzda java default olaný yok eder
	//dolayýsýyla biz bir constructer oluþturduðumuzda mutlaka default 
	//sonstructor yerine bir constructer yazmalýyýz
	
	public Otomobil(){ //default constructer yerine bunu mutlaka yazmalýyýz.
		
	}
	
	
    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
    public void yakit(String yakit) { // method
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) { // method
        System.out.println("Araba " + vites + " viteslidir");
    }
    
}
