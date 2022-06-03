package abstractKeyword.AbstractClassAndMethod;

public class MyClass {

	public static void main(String[] args) {
		// Bank abc = new Bank(); // Erroe because we can not create any object from abstract class
		Bank abc = new Bank_ABC();
		System.out.println(abc.getInterestRate());

	}

}
