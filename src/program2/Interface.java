package program2;
interface Shape{
	void print();
	static int cube(int X) {
		return X*X*X;
	}
}

public class Interface implements Shape {
	public void print ()
	{System.out.println("this is interface");}

	
	public static void main(String[] args) {
		Shape obj=new Interface();
		obj.print();
		System.out.println(Shape.cube(5));
		
	}

}
