package day32_Stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {

	public static void main(String[] args) {
		
		String str="";
		StringBuilder sb=new StringBuilder("");
		
		LocalTime lt1=LocalTime.now();
		System.out.println(lt1);
		for (int i = 0; i < 100000; i++) {
			str+=i;
		}
		LocalTime lt2=LocalTime.now();
		System.out.println(lt2);
		
		LocalTime lt3=LocalTime.now();
		System.out.println(lt3);
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		LocalTime lt4=LocalTime.now();
		System.out.println(lt2);

	}

}
