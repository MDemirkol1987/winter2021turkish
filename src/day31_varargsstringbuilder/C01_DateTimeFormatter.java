package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //2021-03-20T17:17:22.513765700
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt));
		
		LocalDate dogumTarihi=LocalDate.of(1987, 10, 27);
		LocalDate bugün=LocalDate.now();
		
		Period benimYaþým=Period.between(dogumTarihi, bugün);
		System.out.println(benimYaþým);
		
	}

}
