package day23_statickeyword;

public class StaticVariables {
    int x; // static olmad��� i�in her yerde 0 diye ba�lar 
    static int y;
    
    StaticVariables (int i) {
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        
        new StaticVariables(2) ; 
        StaticVariables dnm = new StaticVariables(3);
        System.out.println(dnm.x + "," +dnm.y);
    }
}
