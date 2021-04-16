package day30_datetime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime time=LocalDateTime.now();
		System.out.println(time);
		
		System.out.println(time.toString());
		
		String ldt=time.toString();
		
		System.out.println(ldt.startsWith("2021"));
	}

}
