package Inheritance_2;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Second child constructor");
	}
	
	public void makePizza() {
		System.out.println("Second child's secret pizza");
	}
	
	@Override
	public void makePasta() {
		super.makePasta();
		System.out.println("+ more Second's things");
	}
}
