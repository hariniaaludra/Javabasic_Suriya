package program2;

class Inheritance {
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

class Inheritsub extends Inheritance {
	void multi(int b) {
		j = b;
		System.out.println(j);
	}

}

class Hierarchical {
	public static void main(String args[]) {
		Inherit obj = new Inherit();
		obj.num();
		obj.num1(200);
		Inheritsub obj1 = new Inheritsub();
		obj1.multi(7);

	}

}
