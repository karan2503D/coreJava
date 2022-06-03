package typeCasting;

public class typeCasting {

	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void add(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		add(125,250);
		add(250f, 256f);

	}

}
