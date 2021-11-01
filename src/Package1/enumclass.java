package Package1;

import java.util.Scanner;

public class enumclass {
	enum dayofweek {
	    SUNDAY(1) , MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
private int num;
private dayofweek(int num) {
	this.num=num;
}
public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	  int num1=sc.nextInt();
	for(dayofweek d:dayofweek.values()) {
		if(num1==d.num) {
			System.out.println(d);
		}
	}
}}}
