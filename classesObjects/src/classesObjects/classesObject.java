package classesObjects;

class person {
	String name;
	int age;

	// Method
	void speak() {
		System.out.println("Method" + name + age);
	}
}

public class classesObject {

	public static void main(String[] args) {

		person ps1 = new person();
		ps1.name = "A";
		ps1.age = 02;
		ps1.speak();

		person ps2 = new person();
		ps2.name = "B";
		ps2.age = 03;

	}

}
