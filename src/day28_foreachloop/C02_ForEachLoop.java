package day28_foreachloop;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		
		int carpim=1;
		for(int w:arr) {
			carpim*=w;
		}
		
		System.out.println("tüm çarpým:" + carpim);
	}

}
