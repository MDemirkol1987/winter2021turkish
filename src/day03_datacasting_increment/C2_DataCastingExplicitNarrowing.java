package day03_datacasting_increment;

public class C2_DataCastingExplicitNarrowing {

	public static void main(String[] args) {
		
		//Double bir de�i�ken olu�tural�m ve bunu integer ve byte cevirece�iz
		
		double numDouble = 131.56;
		int numInt = (int)numDouble; //parantez i�inde (int)yazmak zorunlulu�u bize veriyor.
									 //double integer ge�erken ondal�k k�sm� direkt atarlama yuvarlama yapmaz.
		
		System.out.println("Integer De�i�ken De�eri :" + " " + numInt);
		
		byte numByte = (byte)numInt;
		System.out.println("Byte De�i�ken De�eri :" + " " + numByte);
		
	}

}
