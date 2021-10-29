package pr2;

class Add {
	int i = 100;
	int j;

	public void num() {
		System.out.println(i);
	}
}

class sub extends Add {
	void num1(int a) {
		i = a;
		System.out.println(i);
	}
}

class Mul extends Add {
	void multi(int b) {
		j = b;
		System.out.println(j);
	}

}

class Hierarchical {
	public static void main(String args[]) {
		sub d = new sub();
		d.num();
		d.num1(200);
		Mul b = new Mul();
		b.multi(7);

	}

}
