package program2;

 public class Switchenum {
enum Climate {WINTER,SUMMER,FALL}
public static void main(String[] args) {
Climate sec=Climate.WINTER;
	switch(sec) {
	case SUMMER:
		System.out.println("SUMMER");
		break;
	case FALL:
		System.out.println("FALL");
		break;
	case WINTER:
		System.out.println("WINTER");
		break;
		default:
			System.out.println("it's is not declare");
	}
}}
