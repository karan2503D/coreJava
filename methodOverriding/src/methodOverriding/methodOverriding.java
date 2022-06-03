package methodOverriding;

// method overloading 
// method with different signatures
// Any return type 

public class methodOverriding {

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		add(110,1052);
		add(250.02,25.058);
		

	}

}
