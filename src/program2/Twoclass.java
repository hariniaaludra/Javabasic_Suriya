package program2;

public class Twoclass {
	int x = 5;

}

class Second {
	public static void main(String args[]) {// main function should be inside the main class
		Twoclass obj = new Twoclass();
		System.out.println(obj.x);

	}
}