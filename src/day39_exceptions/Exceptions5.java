package day39_exceptions;

public class Exceptions5 {

	public static void main(String[] args) {
		// null olarak tanýmlanmýs bir obje ile uygun olmayan bir islem yapmaya calýstýgýmýzda 
				// 	Java NullPointerException verir
				// Unchecked exception'dir
				//null objesini uygun olmayan bir komutta kullanirsaniz Java NullPointerException verir.
	
				//NullPointerException run time exception’dir.
				
				String str1 = " ";
				String str2 ="";
				String str3 = null; // null bir deger degildir sadece str3'un hicbirseye esit olmadýgýný
				                    // soyleyen bir isaretcidir(pointer)
				
				
				System.out.println(str1.length()); // 1
				System.out.println(str2.length()); // 0
				//System.out.println(str3.length()); // NullPointerException
				
				System.out.println(str3+ "bos");
				System.out.println(str3.concat("bos"));


	}

}
