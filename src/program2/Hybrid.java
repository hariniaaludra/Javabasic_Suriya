package program2;

class Hierarchical1 {//use proper standard name for classes
	public void disp() {
		System.out.println("C");
	}
}

class Herarchical2 extends Hierarchical1 {
	public void disp() {
		System.out.println("A");
	}
}

class Hierarchical3 extends Hierarchical1 {
	public void disp() {
		System.out.println("B");
	}

}

class Singleinheritance extends Hierarchical1 {
	public void disp() {
		System.out.println("D");
	}
}

public class Hybrid {
	public static void main(String args[]) {
		Hierarchical1 ob = new Hierarchical1();
		ob.disp();
		Singleinheritance obj = new Singleinheritance();
		obj.disp();
	}
}
