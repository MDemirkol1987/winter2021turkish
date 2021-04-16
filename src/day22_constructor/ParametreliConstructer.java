package day22_constructor;

public class ParametreliConstructer {

		String marka;
	    String model;
	    int yil;
	    boolean kazasiVarMi;
	    
	    
	    public ParametreliConstructer (int yil) {
	    	this.yil=yil;
	    }
	    public ParametreliConstructer() {
	    	
	    }
	    public ParametreliConstructer (String Marka,String Model) {
	    	
	    }
	    public ParametreliConstructer (String marka,String model,int yil,boolean kazasiVarMi) {
	    	this.marka=marka;
	    	this.model=model;
	    	this.yil=yil;
	    	this.kazasiVarMi=kazasiVarMi;
	    }
	    public void yakit(String yakit) { // method
	        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    }
	    
	    public void vites(String vites) { // method
	        System.out.println("Araba " + vites + " viteslidir");
	    }

}
