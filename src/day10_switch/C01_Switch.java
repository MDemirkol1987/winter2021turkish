package day10_switch;

import java.util.Scanner;

public class C01_Switch {

	public static void main(String[] args) {
			        /*
		         * kullanicidan bir rakam isteyin
		         * girilen rakami yazi ile yazdirin     
		         *  */
		
		//switch statement da long,double,float ve boolean kullan�lamaz
		//case sa�lad��� yerde break olay� durdurur ve sonucu yazar
		        
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("L�tfen bir rakam giriniz : ");
		        
		        int sayi = scanner.nextInt();
		        
		        switch (sayi) {
		        case 1:
		        	System.out.println("say�=1");
		        	break;
		        case 2:
		        	System.out.println("say�=2");
		        	break;
		        case 3:
		        	System.out.println("say�=3");
		        	break;
		        case 4:
		        	System.out.println("say�=4");
		        	break;
		        case 5:
		        	System.out.println("say�=5");
		        	break;
		        case 6:
		        	System.out.println("say�=6");
		        	break;
		        case 7:
		        	System.out.println("say�=7");
		        	break;
		        case 8:
		        	System.out.println("say�=8");
		        	break;
		        case 9:
		        	System.out.println("say�=9");
		        	break;
		        case 10:
		        	System.out.println("say�=10");
		        	break;
		        default:
		        	System.out.println("Ba�ka rakam giriniz");
		        }
		    }


	}

