package program2;// use standard package name
interface Player {
	void show();	
}
interface Statement{
	void print();	
}

public class Multipleinterface implements Player,Statement {
	public void show() {
		System.out.println("it's shows the player");
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
