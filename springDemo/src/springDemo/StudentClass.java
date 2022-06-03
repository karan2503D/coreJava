package springDemo;

import java.util.Scanner;

public class StudentClass {
	// User Input using scanner
	public static void main(String[] args) {
		System.out.println("Enter Random Number");
		Scanner sc = new Scanner(System.in);
		// String means array of characters.
		int inputValue = sc.nextInt(); // nextDouble, nextFloat,nextShort,next, nextByte, .... 
		System.out.println(inputValue);
	}
	
}
