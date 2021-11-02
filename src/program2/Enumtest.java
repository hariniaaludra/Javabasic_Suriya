package program2;
import java.time.DayOfWeek;
import java.util.*;  
public class Enumtest{
	
  public static void main(String[] args) {  
	 Scanner obj=new Scanner(System.in);
	  int i=obj.nextInt();
    DayOfWeek day = DayOfWeek.of(i);  
    System.out.println(day.name());  
    System.out.println(day.ordinal());  
    System.out.println(day.getValue());    
}}  
