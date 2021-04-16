package day21_scope;

public class Scope1 {

	static int schoolId=1201;
	static String schoolName="Star Collage";
	static boolean open;
	int deco;
	
	//static variebles create in class level so they use everywhere in class
	//
	
	public static void main(String[] args) {
		
		System.out.println(schoolId + " " + schoolName + " " + open);
		schoolId=1202;
		open=true;
		
		staticMethod();
		
		System.out.println(schoolId + " " + schoolName + " " + open);
			
	}

	public static void staticMethod() {
		
		System.out.println(schoolId + " " + schoolName + " " + open);
		
		
	}
	
	public void method() {
		System.out.println(schoolId);
	}
}
