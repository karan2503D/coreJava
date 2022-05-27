package interfaces;

public class Person implements Info {
	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void Greet() {
		System.out.println("Person Greet");
	}

	@Override
	public void showInfo() {
		System.out.println("Person Name" + name);
		
	}
}	
