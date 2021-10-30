package Package1;

public class enumclass {
	enum dayofweek {
	    SUNDAY(1) , MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
private int num;
private dayofweek(int num) {
	this.num=num;
}
public static void main(String[]args) {
	int num1=1;
	int count=0;
	for(dayofweek d:dayofweek.values()) {
		if(num1==d.num) {
			//count++;
			System.out.println(d);
		}
	}
}}}
