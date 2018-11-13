package Inheritance_2;

public class FirstChildClass extends ParentClass{
	public FirstChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("First child constructor");
	}
	
	public void makePizza() {
		System.out.println("First child's secret pizza");
	}
	
	@Override
	public void makePasta() {
		super.makePasta();
		System.out.println("+ more First's things");
	}
}
