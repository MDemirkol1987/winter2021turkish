package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// we dont must create object for static variables
		//if we want to call static variables in another classes we must write CLASS NAME . static variables name  
		Scope1 obj9=new Scope1();
		obj9.deco=14;
		System.out.println(obj9.deco);
		
		
		System.out.println(Scope1.schoolName);
		System.out.println(Scope1.schoolId);    //java is run time program. so if we call static variables in another classes
												//first assign calling this class from another classes.
		
		Scope1.staticMethod(); //bu methoda elimizdeki olanlar ile gidip öyle method içinde çalýþýyoruz..
		System.out.println(Scope1.schoolName);
		System.out.println(Scope1.schoolId);
		
	}

}
