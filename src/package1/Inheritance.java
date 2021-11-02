package package1;
public	class Inheritance {
		int i = 100;
		int j;

		public void num() {
			System.out.println(i);
		}
	}

	class Parent1 extends Inheritance {
		void num1(int a) {
			i = a;
			System.out.println(i);
		}
	}

	class Child extends Inheritance {
		void multi(int b) {
			j = b;
			System.out.println(j);
		}

	}
