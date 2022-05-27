package switchStatements;

import java.util.Scanner;

public class switchStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Command");
		String text = input.nextLine();
		switch (text) {
		case "Start": 
			System.out.println("Pressed Start");
			break;
		case "End": 
			System.out.println("Pressed Ended");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
		
	}

}
