package pr2;

import java.util.Scanner;

public class Sample1 {

enum week{
	ONE("1 SUNDAY"),TWO("2 MONDAY");
	String week_name;
	week(String week_name){
		this.week_name=week_name;
	}
	public String toString() {
		return week_name;
	}
}
public static void main(String args[])
{
	week[] weeks=week.values();
	for(week week:weeks) {
		Scanner sc=new Scanner(System.in);
		  String  a1=sc.nextLine();
		System.out.println(week.toString());
		}
	}
}

