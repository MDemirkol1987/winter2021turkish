package day03_datacasting_increment;

public class C3_IncerementDecrement {

	public static void main(String[] args) {
		
		int num = 15;
		//bir say�y� 2 artt�rmak onlar� toplamak demektir.
		
		int num2 = num + 2;
		 
		System.out.println("num2: " + num2);
		System.out.println("num: " + num);
		
		num=num+5;
		
		System.out.println("num: " + num);//en son atanan de�er �zerinden devam etti.
		
		num += 5;//tekrar edenlerde bu �ekilde yaz�labilir
		
		System.out.println("num k�sa y�ntem: " + num);
		
		num++;// birer birer artt�r�mda bu �ekilde kullan�yoruz.
		System.out.println("num birer artt�rma: " + num );
	}

}
