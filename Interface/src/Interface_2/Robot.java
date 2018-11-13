package Interface_2;

public class Robot implements Toy{
	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("Robot====");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Can walk");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Can walk");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("bbbbbbbbb");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("###########");
	}

}
