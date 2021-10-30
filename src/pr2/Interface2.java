package pr2;
interface example{
	void draw();
default void method () { System.out.println("this is default method"); }
}
class interfa implements example{
public void draw() {
		System.out.println("draw square");
	}
}
class interfac implements example{
public 	void draw() {
		System.out .println("draw rectangle");
	}
}
public class Interface2 {
	public static void main(String[] args) {
example b=new interfac();
b.draw();
b.method();
example a=new interfa();
a.draw();
a.method();
	}

}
