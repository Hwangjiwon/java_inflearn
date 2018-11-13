package String_SBuilder;

public class MainClass {

	public static void main(String[] args) {		
		// String str = "java";
		String str = new String("JAVA");
		System.out.println(str);
		//basic string
		str = str+"_inflearn";
		System.out.println(str);
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("HELLO");
		sb.append(" WORLD");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(0, 2);
		System.out.println(sb);
		System.out.println(sb.length());
		sb.replace(2, 5, "hjw");
		System.out.println(sb);
		
		
	}

}
