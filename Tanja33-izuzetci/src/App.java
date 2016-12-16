import java.io.IOException;
import java.text.ParseException;
 
public class App {
 
    public static void main(String[] args)  {
        Test test = new Test();
        
        int count=8;
     
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Nije moguce parsirati fajl, greska broj");
        }
         
     
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
     count++;
     System.out.println("greska broj"+" "+ count);
    }
 
}