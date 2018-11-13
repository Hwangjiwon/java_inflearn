package make_class2;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("---Child constructor---");
	}
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo()--");
		
		this.name = n;
		this.gender = g;
		this.age = a;
	}
	public void getInfo() {
		System.out.println("--getInfo()--");
		System.out.println("name: "+name);
		System.out.println("name: "+gender);
		System.out.println("name: "+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 | age > 100) {
			System.out.printf("입력한 값 %d은 오류\n", age);
			return;
		}
		this.age = age;
	}
	
}
