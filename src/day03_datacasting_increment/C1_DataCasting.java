package day03_datacasting_increment;

public class C1_DataCasting {

	public static void main(String[] args) {
	
		//byte<short<int<long<float<double
		
		
		//byte veri t�r�nde bir de�i�ken olu�turup de�er atay�n.
		//olu�turulan variable ad�m ad�m Auto WIDENING ile geni�letip yazd�r�n.
		
		byte nunByte = 34;
		System.out.println("Byte De�i�ken De�eri :"+ " " + nunByte);
		
		//short yapal�m
		
		short nunShort = nunByte; //short byte b�y�k oldu�u i�in java �ikayet etmiyor.
								  // Auto Widening ile de�eri short variable atiyor
		System.out.println("Short De�i�ken De�eri : " + " " + nunShort);
		
		int nunInt = nunShort;
		System.out.println("Integer De�i�ken De�eri : " + " " + nunInt);
		
		float nunFloat = nunInt;
		System.out.println("Float De�i�ken De�eri : " + " " + nunFloat);
		
		
	}

}
