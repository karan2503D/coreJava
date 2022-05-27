package arrayStatement;

public class arrayStatement {

	public static void main(String[] args) {
		
		int value = 7;
		int [] values;
		values = new int[3];
		// Setting Values
		values[0] = 0;
		values[1] = 1;
		values[2] = 2;
		// Getting values
		// System.out.println(values[0]);
		
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = { 5, 6, 7 };
		for(int i=0; i< numbers.length;i++) {
			System.out.println(numbers[i]);
		}

	}

}
