package getterSetters;

// Methods With parameter
class robotTalk{
	public void Speak(String name) {
		System.out.println("Speak" + name);
	}
	
	public void jump(int a) { // parameters can be double, integer, string and any
		System.out.println(a);
	}
}

// Setters
class frog{
	private String frogName;
	private int frogAge;
	
	public void setFrogName(String frogName) {
		this.frogName = frogName;
	}
	
	public void setFrogAge(int frogAge) {
		this.frogAge = frogAge;
	}
	
	public String getName() {
		return frogName;
	}
	public int getAge() {
		return frogAge;
	}
	
	// Method Calling Another Method
	public void setInfo(String frogName,int frogAge) {
		setFrogName(frogName);
		setFrogAge(frogAge);
	}
	
}

// Getters
class Person{
	String name;
	int age;
	
	void speak(String name) {
		System.out.println("Name :" + name);
	}
	
	int calculateYears(int b) {
		int yearsRemain = 65 - b;
		return yearsRemain;
	}
	
	
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class getterSetters {

	public static void main(String[] args) {
		Person ps1 = new Person();
		ps1.age = 25;
		ps1.name = "Test";
		
		//Setters
		int y = ps1.calculateYears(50);
		System.out.println("Years till retirement " + y);
		
		// Getters
		int age = ps1.getAge();
		String name = ps1.getName();
		System.out.println("Name " + name + " Age " + age);

		
		robotTalk rob = new robotTalk();
		rob.Speak(" Test");
		rob.jump(12);
		
		frog frog1 = new frog();
		
		frog1.setFrogName("C");
		frog1.setFrogAge(25);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}

}
