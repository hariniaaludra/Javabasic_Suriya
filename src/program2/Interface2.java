package program2;
interface Example{
	void draw();
default void shape () { System.out.println("this is default method"); }
}
class Square implements Example{
public void draw() {
		System.out.println("draw square");
	}
}
class Rectangle implements Example{
public 	void draw() {
		System.out .println("draw rectangle");
	}
}
public class Interface2 {
	public static void main(String[] args) {
Example obj=new Square();
obj.draw();
obj.shape();
Example obj1=new Rectangle();
obj1.draw();
obj1.shape();
	}

}
