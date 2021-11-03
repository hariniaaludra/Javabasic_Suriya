package program3;

public class Bufferexamples {
	public static void main (String[]args)
	{
StringBuffer sb=new StringBuffer("hello world");
sb.append("programing");
System.out.println(sb);
sb.insert(1,"java");
System.out.println(sb);
sb.replace(1,3,"java");
System.out.println(sb);
sb.delete(1,3);
System.out.println(sb);
sb.reverse();
System.out.println(sb);



}
	}
