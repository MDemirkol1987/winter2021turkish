package day23_statickeyword;

public class Static1 {

	static String name="Mehmet";
	int old=49;
	
	public static void main(String[] args) {
		
		Static1 st1=new Static1();
		Static1 st2=new Static1();
		Static1 st3=new Static1();
		
		st1.name="hasan";
		st1.old=25;
		System.out.println(st1.name + " " + st1.old);
		
		st2.name="Ayse";
		st2.old=30;
		System.out.println(st2.name + " " +st2.old);
		System.out.println(st1.name + " " +st1.old);
		
		st3.name="Alican";
		st3.old=40;
		System.out.println(st3.name + " " +st3.old);
		System.out.println(st2.name + " " +st2.old);
		System.out.println(st1.name + " " +st1.old);
	}

}
