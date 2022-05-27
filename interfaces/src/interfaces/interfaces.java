package interfaces;

public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mac1 = new Machine();
		mac1.Start();
		
		Person ps1= new Person("Constructor");
		ps1.Greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = ps1;
		info2.showInfo();
		
	}

}
