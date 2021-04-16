package day22_constructor;

	
public class Otomobil {
	
	public Otomobil(String renk) { //istersek constructor parametreli olarak olu�turabilir.
		
	}
    
	//biz bir contructor olu�turdu�umuzda java default olan� yok eder
	//dolay�s�yla biz bir constructer olu�turdu�umuzda mutlaka default 
	//sonstructor yerine bir constructer yazmal�y�z
	
	public Otomobil(){ //default constructer yerine bunu mutlaka yazmal�y�z.
		
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
