package Interface_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy robot = new Robot();
		Toy airplane = new Airplane();
		
		Toy toys[] = {robot, airplane};
		
		for(int i=0; i<toys.length; i++) {
			toys[i].alarm();
			toys[i].light();
			toys[i].run();
			toys[i].walk();
			System.out.println("");
		}
	}

}
