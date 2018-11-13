package make_class2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child1 = new ChildClass();
		ChildClass child2 = new ChildClass();

		child1.getInfo();

		child2.setInfo("jiwon", "W", 25);
		child2.getInfo();
		
		child1.setInfo("inna","W", 49);
		child1.getInfo();
		child1.setAge(50);
		child1.getInfo();
		
		child1.setAge(1000);
		child1.getInfo();
		
	}

}
