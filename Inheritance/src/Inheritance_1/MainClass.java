package Inheritance_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child = new ChildClass();
		child.childFun();
		child.parentFun();
		
		ParentClass child2 = new ChildClass();
		//child2.childFun();
		child2.parentFun();
	}

}
