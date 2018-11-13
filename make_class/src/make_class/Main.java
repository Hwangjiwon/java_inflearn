package make_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandeur car1 = new Grandeur(); // 积己磊 龋免秦 按眉积己
		car1.color = "red";
		car1.gear = "auto";
		car1.run();
		car1.stop();
		car1.info();
		
		Bicycle bi1 = new Bicycle("blue",100000);
		bi1.info();
		
		Bicycle bi2 = new Bicycle();
		bi2.color = "yello";
		bi2.info();
	}

}
