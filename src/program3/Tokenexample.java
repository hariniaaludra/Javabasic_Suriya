package program3;

import java.util.*;
import java.io.*;

public class Tokenexample {
	public static void main(String[] args) {

		String myString = "My name is suriya";
		StringTokenizer st = new StringTokenizer(myString);
		System.out.println("Input string is: " + myString);
		st.nextElement();
		System.out.println("The next element is: " + st.nextElement());
		System.out.println("The next element is: " + st.nextElement());
	}
}
