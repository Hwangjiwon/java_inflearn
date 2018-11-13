package Inheritance_2;

public class ChildClass extends ParentClass{
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("child constructor");
	}
	
	public void makePizza() {
		System.out.println("child's secret pizza");
	}
	
	@Override
	public void makePasta() {
		System.out.println("parent's secret pasta + more things");
	}
}
