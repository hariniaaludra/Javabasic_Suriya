package pr2; 
enum Season{WINTER,SUMMER,SPRING,FALL,SURIYA}
class Enum{
	public static void main(String[] args) {
		for (Season s:Season.values()) {
System.out.println(s);
}
		
		System.out.println(Season.valueOf("SURIYA"));
		System.out.println(Season.valueOf("SURIYA").ordinal());
		
	}

}
