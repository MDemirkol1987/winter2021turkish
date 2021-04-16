package day23_statickeyword;

public class StaticVariables {
    int x; // static olmadýðý için her yerde 0 diye baþlar 
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
