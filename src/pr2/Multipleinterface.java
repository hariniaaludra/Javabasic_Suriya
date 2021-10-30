package pr2;
interface exam1{
	void show();	
}
interface exam2{
	void print();	
}

public class Multipleinterface implements exam1,exam2 {
	public void show() {
		System.out.println("it's shows the value");
	}
	public void print() {
		System.out.println("it's will print the value");
	}

	public static void main(String[] args) {
		Multipleinterface ob=new Multipleinterface();
		ob.print();
ob.show();
	}

}
