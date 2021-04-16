package day14_MethodCreation;

public class C01_MethodCreation1 {

	public static void main(String[] args) {
		
		String str="Java cok guzel";
		// 1 )Java methodlarin sadece ismine deðil,isim+parametrelere bakar
		// sadece parametre sayýsý deðil parametrelerin data tiplerine de bakar.
		
		str.endsWith("el"); //Bu method görevi gidip kelimenin son kýsmýný kontroþ etmek
						  //bu methodu kullanmak için bu method'un kontrol ettikten sonra bana rapor olarak ne getirdiðini bþlmem lazým.
		
		
		// 2) Bir method oluþturduðumuzda methodun ne yapacaðýna				  
		//    ve görevi yaptýktan sonra bana ne döndüreceðine baþtan karar vermeliyiz.
		
		
		// 3) Bir method oluþturulurken " str.indexOf(String str, intfromIndex) "de olduðu gibi
		//    dýþarýdan kabul edeceði parametreleri ve bu parametrelerin data tiplerini deklare etmeliyiz.
		
		//    Methodu çalýþtýrmak istediðimizdde Parametre olaraka deklare edilen 
		//    data tiplerine uygun deðerler girmeliyiz.
		//    girilen bu degerler ARGUMENT denir.
		
		str.indexOf("v", 1);
	}

}
