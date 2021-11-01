package program2;

class Inheritance {// use proper class name
	int i = 100;
	int j;

	public void num() {
		System.out.println(i);
	}
}

class Inherit extends Inheritance {
	void num1(int a) {
		i = a;
		System.out.println(i);
	}
}

class   extends Inheritance {
	void multi(int b) {
		j = b;
		System.out.println(j);
	}

}

class Hierarchical {
	public static void main(String args[]) {
		Inherit d = new ();
		d.num();
		d.num1(200);
		Mul b = new Mul();
		b.multi(7);

	}

}
