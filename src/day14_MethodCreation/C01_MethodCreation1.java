package day14_MethodCreation;

public class C01_MethodCreation1 {

	public static void main(String[] args) {
		
		String str="Java cok guzel";
		// 1 )Java methodlarin sadece ismine de�il,isim+parametrelere bakar
		// sadece parametre say�s� de�il parametrelerin data tiplerine de bakar.
		
		str.endsWith("el"); //Bu method g�revi gidip kelimenin son k�sm�n� kontro� etmek
						  //bu methodu kullanmak i�in bu method'un kontrol ettikten sonra bana rapor olarak ne getirdi�ini b�lmem laz�m.
		
		
		// 2) Bir method olu�turdu�umuzda methodun ne yapaca��na				  
		//    ve g�revi yapt�ktan sonra bana ne d�nd�rece�ine ba�tan karar vermeliyiz.
		
		
		// 3) Bir method olu�turulurken " str.indexOf(String str, intfromIndex) "de oldu�u gibi
		//    d��ar�dan kabul edece�i parametreleri ve bu parametrelerin data tiplerini deklare etmeliyiz.
		
		//    Methodu �al��t�rmak istedi�imizdde Parametre olaraka deklare edilen 
		//    data tiplerine uygun de�erler girmeliyiz.
		//    girilen bu degerler ARGUMENT denir.
		
		str.indexOf("v", 1);
	}

}
