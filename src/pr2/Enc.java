package pr2;

public class Enc {
private String name;
public String getName() {
	return name;
}
public void setName(String n)
{
	this.name=n;
}
	public static void main(String[] args) {
		Enc ob=new Enc();
		ob.setName("suriya");
		System.out.println(ob.getName());
	}

} 