package operators;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// Math/Arithmetic operators : + - * / %
		// post and pre Incrementation / Assignment operators : c++, ++c, +=, -=, *=, /=     
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		int outputValue = a + b;
		System.out.println("A= " + a + " " + "B= " + b + " Sum=" + outputValue);
		int x = ++a;
		System.out.println(x);
	}

}
