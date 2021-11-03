package program3;

import java.util.StringTokenizer;

public class Stringtokenexample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("myname, is ,suriya" ,",",true);
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
