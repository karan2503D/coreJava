package userInput;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
		// Scanner class is used to take user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Value");
		
		String line = input.nextLine();
		int value = input.nextInt();
		double DoubleValue = input.nextDouble();
		
		System.out.println("Value " + line);
		
		System.out.println("Integer Value " + value);
		
		
		
	}

}
