package test;
import java.util.*;

public class Tokenexample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer Tk=new StringTokenizer(s," !,?._'@");
        
        System.out.println(Tk.countTokens());
          while (Tk.hasMoreTokens())   
     {
         System.out.println(Tk.nextToken());    
     }                
        scan.close();
    }
}

