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
		System.out.println(saat.getMinute()); //isteðini getir
		System.out.println(saat.plusHours(2)); //2 saat sonrasý
		System.out.println(saat.minusHours(5)); // 5 saat öncesi
		System.out.println(saat.now(ZoneId.of("Japan")));
	}

}
