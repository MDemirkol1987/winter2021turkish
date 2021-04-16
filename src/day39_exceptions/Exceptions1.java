package day39_exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Exceptions1 {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\TOSHIBA\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        System.out.println("kod bloke olmamisss");
    }
}
