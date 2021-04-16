package day22_constructor;

	
public class Otomobil {
	
	public Otomobil(String renk) { //istersek constructor parametreli olarak oluşturabilir.
		
	}
    
	//biz bir contructor oluşturduğumuzda java default olanı yok eder
	//dolayısıyla biz bir constructer oluşturduğumuzda mutlaka default 
	//sonstructor yerine bir constructer yazmalıyız
	
	public Otomobil(){ //default constructer yerine bunu mutlaka yazmalıyız.
		
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
