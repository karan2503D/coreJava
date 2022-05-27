package whileLoop;

public class whileLoop {

	public static void main(String[] args) {
		int value = 0;
//		boolean loop = value < 5;
	//	System.out.println(loop);
		
		while(value <= 10) {
			System.out.println("Infinite Loop Because condition is always true" + value);
			value = value + 1 ;
		}
	}

}
