package pr2;
interface value{
	void method ();
}
	interface val extends value{
		void method1();
	}
public class Interfaceinheritance implements val{
public	void method() {
		System.out.println("it is interface method");
	}
public 	void method1() {
		System.out.println("it is interface method1");
	}
	

	public static void main(String[] args) {
		Interfaceinheritance ob= new Interfaceinheritance();
		ob.method();
		ob.method1();
		

	}

}
