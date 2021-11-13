package test;
import java.util.*;

public class Stringreverseexample {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String r= new StringBuffer(A).reverse().toString();
        if(A.equals(r)){
            System.out.println("Yes");  
        }
        else
        {
            System.out.println("No");
        }
    }
}

