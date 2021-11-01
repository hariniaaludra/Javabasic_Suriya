package program2;
interface example{
	void draw();
default void method () { System.out.println("this is default method"); }
}
class Interfa implements example{
public void draw() {
		System.out.println("draw square");
	}
}
class Interfac implements example{
public 	void draw() {
		System.out .println("draw rectangle");
	}
}
public class Interface2 {
	public static void main(String[] args) {
example b=new Interfac();
b.draw();
b.method();
example a=new Interfa();
a.draw();
a.method();
	}

}
