package program2;

class Hybridinherit {//use proper standard name for classes
	public void disp() {
		System.out.println("Cat");
	}
}

class Subinherit extends Hybridinherit {
	public void disp() {
		System.out.println("A");
	}
}

class Inheritchild extends Hybridinherit {
	public void disp() {
		System.out.println("B");
	}

}

class Singleinheritance extends Hybridinherit {
	public void disp() {
		System.out.println("Dog");
	}
}

public class Hybrid {
	public static void main(String args[]) {
		Hybridinherit obj = new Hybridinherit();
		obj.disp();
		Singleinheritance obj1 = new Singleinheritance();
		obj1.disp();
	}
}
