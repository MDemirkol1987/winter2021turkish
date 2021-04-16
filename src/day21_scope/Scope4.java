package day21_scope;

public class Scope4 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			
			String name="John";
			System.out.println(i + " " + name);
			
		} // System.out.println(name); // creating in loop variables special only for loop.
		
		int count=0; // if we dont assign value java gives us CTE...for example int count;(local variable)
		while(count<5) {
			System.out.print(count);
			count++;
		}
	}

}
