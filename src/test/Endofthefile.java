package test;
import java.util.*;

public class Endofthefile {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        int i=1;
       while(in.hasNext())
           {
           a=in.nextLine();
           System.out.println(i+" "+a);
           i++;
       }
    }
}

