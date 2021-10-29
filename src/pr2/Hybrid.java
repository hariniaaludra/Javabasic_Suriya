package pr2;

class C {
	public void disp() {
		System.out.println("C");
	}
}

class A extends C {
	public void disp() {
		System.out.println("A");
	}
}

class B extends C {
	public void disp() {
		System.out.println("B");
	}

}

class D extends A {
	public void disp() {
		System.out.println("D");
	}
}

public class Hybrid {
	public static void main(String args[]) {
		B ob = new B();
		ob.disp();
		D obj = new D();
		obj.disp();
	}
}
