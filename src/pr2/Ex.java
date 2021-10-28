package pr2;

public class Ex {
	int a;
		   Ex(int i) {
		      a=i;
		   }
		   void display() {
		      System.out.println(a);
		   }
		   public static void main(String[] args) {
		      Ex c = new Ex(5);
		      Laptop l = new Laptop(5,6);
		      c.display();
		      l.laptop_method();
		   }
		}
		class Laptop {
			int a;
			int b;
		   Laptop(int i,int c) {
			   a=i;
			   b=c;
		   }
		   void laptop_method() {
		      System.out.println(a+" "+b);
		   }
		}
