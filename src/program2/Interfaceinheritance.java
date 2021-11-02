package program2;
interface Value{
	void statement ();
}
	interface Values extends Value{
		void block();
	}
public class Interfaceinheritance implements Values{
public	void statement() {
		System.out.println("it is interface method");
	}
public 	void block() {
		System.out.println("it is interface method1");
	}
	

	public static void main(String[] args) {
		Interfaceinheritance obj= new Interfaceinheritance();
		obj.statement();
		obj.block();
		

	}

}
