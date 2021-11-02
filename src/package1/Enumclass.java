package package1;

import java.util.Scanner;

public class Enumclass {
	enum Dayofweek {
	    SUNDAY(1) , MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
private int num;
private Dayofweek(int num) {
	this.num=num;
}
public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	  int num1=sc.nextInt();
	for(Dayofweek d:Dayofweek.values()) {
		if(num1==d.num) {
			System.out.println(d);
		}
	}
}}}
