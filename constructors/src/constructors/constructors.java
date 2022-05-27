package constructors;

class Machine {
	// Method can have return type but a constructor can not have a return type
	// Constructor name should be same as class name
	// Method Starts with lower case letter but constructor not
	private String name;
	private int age;
	
	public Machine() {
		// Calling Constructor inside Another Constructor
		this("F");
		
		name = "D";
		System.out.println("Constructor");
	}
	// Constructor Overloading Same name but different parameters
	public Machine(String name) {
		
		this.name = name;
		System.out.println("Constructor 2");
		
	}
	public Machine(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Constructor 3");
		
	}
}

public class constructors {

	public static void main(String[] args) {
		new Machine() ;
		new Machine("F") ;
		new Machine("F",12) ;
	}

}
