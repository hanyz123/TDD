package hyz.demo;

public class Demo {
 String name="Person";
	int age = 0;
}

class Child extends Demo {
	public String grade;

	public static void main(String[] args) {
		Demo p = new Child();
		System.out.println(p.name);
	}
}
