import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arraylist {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
System.out.println(z);
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (InputMismatchException e) {
      System.out.println(e);
    }  {
      sc.close();
    }
  }
}
