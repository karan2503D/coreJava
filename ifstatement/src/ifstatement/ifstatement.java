package ifstatement;

public class ifstatement {

	public static void main(String[] args) {
		// Conditional Statements
		// boolean conditional = 3 > 8;
		// boolean conditional = 3 == 8; Single equals means assignment, double equals is use to check equality 
		// boolean conditional = 5 != 8; Not Equals 
		// boolean conditional = 5 < 8; 
		// System.out.println(conditional);
		int myInt = 20;
		if(myInt == 4) 
		{
			System.out.println("True");
		}
		else if(myInt > 5) {
			System.out.println("Not True");
		}
		else 
		{
			System.out.println("False");
		}
		
		int loop = 0;
		while (loop < 5) {
			System.out.println("Loopinh" + loop);
			
			if(loop==10) {
				break;
			}
			
			loop++;
		}
	}

}
