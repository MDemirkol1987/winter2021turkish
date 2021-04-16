package day03_datacasting_increment;

public class C1_DataCasting {

	public static void main(String[] args) {
	
		//byte<short<int<long<float<double
		
		
		//byte veri türünde bir deðiþken oluþturup deðer atayýn.
		//oluþturulan variable adým adým Auto WIDENING ile geniþletip yazdýrýn.
		
		byte nunByte = 34;
		System.out.println("Byte Deðiþken Deðeri :"+ " " + nunByte);
		
		//short yapalým
		
		short nunShort = nunByte; //short byte büyük olduðu için java þikayet etmiyor.
								  // Auto Widening ile deðeri short variable atiyor
		System.out.println("Short Deðiþken Deðeri : " + " " + nunShort);
		
		int nunInt = nunShort;
		System.out.println("Integer Deðiþken Deðeri : " + " " + nunInt);
		
		float nunFloat = nunInt;
		System.out.println("Float Deðiþken Deðeri : " + " " + nunFloat);
		
		
	}

}
