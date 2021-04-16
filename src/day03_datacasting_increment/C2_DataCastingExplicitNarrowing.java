package day03_datacasting_increment;

public class C2_DataCastingExplicitNarrowing {

	public static void main(String[] args) {
		
		//Double bir deðiþken oluþturalým ve bunu integer ve byte cevireceðiz
		
		double numDouble = 131.56;
		int numInt = (int)numDouble; //parantez içinde (int)yazmak zorunluluðu bize veriyor.
									 //double integer geçerken ondalýk kýsmý direkt atarlama yuvarlama yapmaz.
		
		System.out.println("Integer Deðiþken Deðeri :" + " " + numInt);
		
		byte numByte = (byte)numInt;
		System.out.println("Byte Deðiþken Deðeri :" + " " + numByte);
		
	}

}
