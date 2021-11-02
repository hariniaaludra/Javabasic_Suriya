package program2;

public class Constructor { // give proper standard name for class
int a;
Constructor(int i)
{
     a=i;
	}
void display() {
	System.out.println(a);
	}
public static void main(String[] args) {// maintain proper structure
Constructor obj = new Constructor(5);
Laptop l = new Laptop(5,6);
obj.display();
l.laptopmethod();
 }
}
class Laptop {
int a;
int b;
Laptop(int i,int c) {
a=i;
b=c;
}
void laptopmethod() {
System.out.println(a+" "+b);
}
}
