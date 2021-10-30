package pr2;

public class Enumclass {
enum Season{
	WINTER(5),SUMMER(10),FALL(15);
	private int value;
	private  Season(int value) {
		this.value=value;
	}
	public static void main(String[] args) {
		for(Season s:Season.values()) {
			System.out.println(s+" "+s.value);
		}

	}}

}
