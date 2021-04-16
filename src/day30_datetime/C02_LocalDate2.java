package day30_datetime;


import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Iterator;

public class C02_LocalDate2 {
	
	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		System.out.println(saat);
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		LocalTime saat2=LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat.getMinute()); //iste�ini getir
		System.out.println(saat.plusHours(2)); //2 saat sonras�
		System.out.println(saat.minusHours(5)); // 5 saat �ncesi
		System.out.println(saat.now(ZoneId.of("Japan")));
	}

}
