package day03_datacasting_increment;

public class C3_IncerementDecrement {

	public static void main(String[] args) {
		
		int num = 15;
		//bir sayıyı 2 arttırmak onları toplamak demektir.
		
		int num2 = num + 2;
		 
		System.out.println("num2: " + num2);
		System.out.println("num: " + num);
		
		num=num+5;
		
		System.out.println("num: " + num);//en son atanan değer üzerinden devam etti.
		
		num += 5;//tekrar edenlerde bu şekilde yazılabilir
		
		System.out.println("num kısa yöntem: " + num);
		
		num++;// birer birer arttırımda bu şekilde kullanıyoruz.
		System.out.println("num birer arttırma: " + num );
	}

}
