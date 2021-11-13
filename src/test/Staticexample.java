package test;
import java.util.*;
public class Staticexample  {
static Scanner scan=new Scanner(System.in);
static int b= scan.nextInt();
static int c=scan.nextInt();
static boolean f=true;
static{
 try{
     if(b<=0||c<=0){
    f=false;
    throw new Exception("Breadth and height must be positive");
    }
    }
    catch(Exception e){
    System.out.println(e);
}
}

public static void main(String[] args){
		if(f){
			int area=b*c;
			System.out.print(area);
		}
		
	}

}


 
