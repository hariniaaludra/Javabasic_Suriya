package pr2;
import java.time.DayOfWeek;
import java.util.*;  
public class Enumtest{
	
  public static void main(String[] args) {  
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
    DayOfWeek day = DayOfWeek.of(i);  
    System.out.println(day.name());  
    System.out.println(day.ordinal());  
    System.out.println(day.getValue());    
}}  
