package day30_datetime;

import java.time.LocalDate;

public class C01_LocalDate1 {

	public static void main(String[] args) {
		
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih); //2021-03-19
		
		tarih.plusWeeks(20);
		System.out.println(tarih.plusWeeks(20));// 2021-08-06
		
		System.out.println(tarih.plusDays(500)); //2022-08-01
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); //2024-08-31
		System.out.println(tarih.minusMonths(15)); //2019-12-19
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); //2017-11-09
		System.out.println(tarih.isLeapYear());//false
		
		System.out.println(tarih.getDayOfYear());//78
		System.out.println(tarih.getMonthValue());//3
		System.out.println(tarih.getDayOfWeek());//Friday
		System.out.println(tarih.getMonth());//march
		
		LocalDate dogumGunu=LocalDate.of(1987, 10, 27);
		System.out.println(dogumGunu.getDayOfWeek()); //tuesday
		
		LocalDate tarih1=LocalDate.of(1987, 10, 27);
		LocalDate tarih2=LocalDate.of(1987, 10, 25);
		
		System.out.println(tarih1.isAfter(tarih2)); //true
		System.out.println(tarih1.isBefore(tarih2)); //false
		
		System.out.println(tarih.getDayOfYear());
		

	}

}
