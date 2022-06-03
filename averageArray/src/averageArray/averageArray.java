package averageArray;

public class averageArray {

	public static void main(String[] args) {
	
		int[] p = { 10,28,34,40,50 };
		int sum = 0;
		for(int a:p) {
			System.out.println(a);
			sum+=a;
		}
		float avg = (float)sum/p.length;
		System.out.println(avg);
	}

}
