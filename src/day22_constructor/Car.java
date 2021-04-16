package day22_constructor;

public class Car {

	String brand;
	String model;
	int year;
	boolean isItCrash;
	
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		System.out.println(car1.brand + " " + car1.model + " " + car1.year + " " + car1.isItCrash);
		
		car1.brand= "Opel";
		car1.model= "Astra";
		car1.year= 2012;
		car1.isItCrash=false;
		System.out.println(car1.brand + " " + car1.model + " " + car1.year + " " + car1.isItCrash);
		
		Car car2=new Car();
		car2.brand= "Hyundai";
		car2.model= "i20";
		car2.year= 2015;
		car2.isItCrash=true;
		System.out.println(car2.brand + " " + car2.model + " " + car2.year + " " + car2.isItCrash);
		

	}

}
