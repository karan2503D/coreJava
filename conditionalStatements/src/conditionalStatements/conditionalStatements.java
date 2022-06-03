package conditionalStatements;

public class conditionalStatements {

	public static void main(String[] args) {
		// If...Else and Relational Operators and logical operators
		int x = 50;
		int y = 50;
		if(x <= 50) {
			System.out.println("Lesser Than");
		}else if(x >= 50) {
			System.out.println("Greater Than");
		}else if(x == 50) {
			System.out.println("Equal");
		}else if(x==50 && y==50){
			System.out.println("Both value is equal");
		}else if(x==50 || y==50){
			System.out.println("Single value is equal");
		}else {
			System.out.println("wrong value");
		}
		// Switch Statement
		int score = 50;
		switch (score) {
		case 90:
			System.out.println("V Good");
			break; // if break is not defined it will go in another case and execute until got break
		case 60:
			System.out.println("Good");
			break;
		case 40: 
			System.out.println("Ok");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + score);
		}

	}

}
