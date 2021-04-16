package day30_datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMM/d");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MM/dd");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("yyyy/MMMM/dd");
		
		LocalDate date=LocalDate.now();
		
		System.out.println(dtf.format(date));
		System.out.println(dtf2.format(date));
		System.out.println(dtf3.format(date));

	}

}
