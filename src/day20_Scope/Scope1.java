package day20_Scope;

import java.util.Scanner;

public class Scope1 {
	
	//default variables 
		/* integer = 0
		   String=null
		   Boolean=False
		   char=Space */
	
	
	int num; //integer default variables are "0"
			 //in class but creating out of main method and not static variables name's are INSTANCE.	
			 //it can use everywhere in class for creating class level
			 //instance variables are name of teacher and name of student like that our example
	String name="Mustafa";
	String surname;     //String default variables are "NULL"
	boolean inVacation; //boolean default variables are "FALSE"
	public String isim;
	public String soyisim;
	public int sayi;
	public static void main(String[] args) {
		
		//System.out.println(num); //we can not receive non static variable in static method.
								   // we can not receive non static variable in main method because our main method is static.
							   //when we want receive INSTANCE variable in main method, we must create OBJECT.
		
		Scanner scan=new Scanner(System.in);// This is standard creating object form in java.
											// class name - object name - creating object keyword - class ismi ();
		   Scope1 obj1 = new Scope1();
		   System.out.println(obj1.num);
		   System.out.println(obj1.name);
		   System.out.println(obj1.surname);
		 
		   
		   									// when creating instance method,we can assign variables. 
		   									//if we dont assign variable ,java assign DEFAULT variables.
		   
		   Scope1 obj2=new Scope1 ();
		   obj2.name="Enis";
		   obj2.surname="Olgac";
		   System.out.println(obj2.name + " " + obj2.surname); //Enis Olgac
		   System.out.println(obj1.name + " " + obj1.surname); //Mustafa null
		   System.out.println(obj2.inVacation); //false
		
	
		   staticMethod();
		   obj1.method();
	}
	
	public static void staticMethod() {
		
		System.out.println("adem");
		Scope1 obj10=new Scope1();
		obj10.num=30;
		System.out.println(obj10.num);
	}
	
	public void method() {
		
		System.out.println("hello");
		num=10;
		System.out.println(num);
		System.out.println(name);
		
	}

}
