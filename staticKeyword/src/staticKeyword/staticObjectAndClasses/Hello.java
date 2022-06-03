package staticKeyword.staticObjectAndClasses;

public class Hello {
	// Static Variable
	public static int age;
	String name;
	int ageNumber;
	static int numofstu = 0;
	
	// constructor
	Hello(){
		numofstu++ ;
	}
	
	// Static Method
	public static int getNumodstu() {
		return numofstu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgeNumber() {
		return ageNumber;
	}
	public void setAgeNumber(int ageNumber) {
		this.ageNumber = ageNumber;
	}
	
	
	public static String DoSomething(String message) {
		return message;
	}
	public String DoSomethingElse(String message) {
		return message;
	}
}
