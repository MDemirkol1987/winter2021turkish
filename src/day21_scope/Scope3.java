package day21_scope;

public class Scope3 {
	
	public static void main(String[] args) {
		
		int num=10;  //creating in method variable only use that method. For example num use only this method.
		int num2; //local variable can create no value
		
		
		//System.out.println(num2);  // but if we dont first value assign we dont use variable.
							//java allow us no value assign create local variable.Because we can use this variable later in another classes
		num2=15; //java allow us; creating variable another line and value assign another line 
				 //Birden fazla method olan classlarda her methodda kullanmamýz gereken
				 //ortak variables varsa class levelde variable oluþturmalýyýz.
				 //
		System.out.println(num);
		
	}
	public static void staticMethod() {
		
		String isim="Enis";
		int num=20;
		System.out.println(num);
		
	}
	
	public void method() {
		
		boolean isTrue=true;
		
	}

}
