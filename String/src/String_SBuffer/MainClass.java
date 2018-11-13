package String_SBuffer;

public class MainClass {

	public static void main(String[] args) {
		// String str = "java";
		String str = new String("JAVA");
		System.out.println(str);
		//basic string
		str = str+"_inflearn";
		System.out.println(str);
		
		//StringBuffer
		
		StringBuffer sbf = new StringBuffer("This is stringBuffer.");
		sbf.append(" How to use?");
		System.out.println(sbf);
		System.out.println(sbf.length());
		
	}

}
