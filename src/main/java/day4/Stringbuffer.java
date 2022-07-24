package day4;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Here's my example ");
		
		System.out.println(sb);
		System.out.println(sb.append("stringbuffer "));
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.insert(30, " from prompt 2"));
		System.out.println(sb.delete(18, 30));
		System.out.println(sb.reverse());

	}

}
