package Inheritance_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		ParentClass child2 = new ChildClass();
		
		parent.makePasta();
		
		child.makePasta();
		child.makePizza();
		
		child2.makePasta();
		
		ParentClass children[] = new ParentClass[2];
		children[0] = new FirstChildClass();
		children[1] = new SecondChildClass();
		
		children[0].makePasta();
		children[1].makePasta();
		
		
	}

}
