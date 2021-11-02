package program2;

class Multilevel {
public	void statement() {// public void
		System.out.println("this is multilevel inheritance");
	}
}

class Parent extends Multilevel {

	public void base() {//public void
		System.out.println("this is extends from multilevel inheritance");
	}
}

class Child extends Parent {
	void block() {// public void
		System.out.println("this is extends from multilevel inheritances");
	}
}

public class Multinheritance {
	public static void main(String[] args) {
		Child ob1 = new Child();
		ob1.block();
		ob1.base();
		ob1.statement();

	}
}
