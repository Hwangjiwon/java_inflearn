package Lambda_prac;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface ld1 = (str) -> {System.out.println(str);};
		ld1.method("hello");
		
		LambdaInterface ld2 = (str) -> System.out.println(str);
		ld2.method("world");
		
		LambdaInterface2 add = (x,y) -> { int result = x+y; return result;};
		System.out.println(add.addmethod(10, 20));
	}

}
