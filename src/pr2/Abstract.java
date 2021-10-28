package pr2;

abstract class Abstract {
	abstract void shap();
	}
class Rect extends Abstract {
	void shap() {
		System.out.println("it is a rectangle");
	}
public static void main(String []args) {
	Abstract a;
	a= new Rect();
	a.shap();	
	
}
}
