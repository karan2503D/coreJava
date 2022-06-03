package staticKeyword.staticObjectAndClasses;

public class MyClass {

	public static void main(String[] args) {
		Hello h=new Hello();
		Hello.DoSomething("Static Method can be access by class name");
		Hello.age = 20;
		System.out.println(Hello.age);
		h.DoSomethingElse("Non Static Method can be access by not class name but with its object");
		
		Hello newStud = new Hello();
		System.out.println(Hello.getNumodstu());
	}

}
