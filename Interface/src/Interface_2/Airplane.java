package Interface_2;

public class Airplane implements Toy {
	public Airplane() {
		// TODO Auto-generated constructor stub
		System.out.println("Airplane=====");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Can't walk");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Can't run");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("rrrrrrrrrrrrr");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("************");
	}
	
}
