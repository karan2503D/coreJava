package dowhileLoop;

import java.util.Scanner;

public class dowhileLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * 
		 * 
		 * while (value != 5) { System.out.println("Enter value Again"); value =
		 * scanner.nextInt(); }
		 */

		int value = 0;
		do {
			System.out.println("Enter value");
			value = scanner.nextInt();
		} while (value != 5);
		System.out.println("Exited");
	}

}
