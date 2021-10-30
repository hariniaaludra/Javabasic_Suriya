package Package1;
	class Inheritance {
		int i = 100;
		int j;

		public void num() {
			System.out.println(i);
		}
	}

	class sub extends Inheritance {
		void num1(int a) {
			i = a;
			System.out.println(i);
		}
	}

	class Mul extends Inheritance {
		void multi(int b) {
			j = b;
			System.out.println(j);
		}

	}
