package toStringMethods;

class frog{
	
	private int Id;
	private String name;
	
	public frog(int Id, String name){
		this.Id = Id;
		this.name = name;
	}
	public String toString() {
		// return Id + " " + name;
		return String.format("%-4d: %s", Id, name);
	}
}

public class toStringMethods {

	public static void main(String[] args) {
		
		frog obj = new frog(52, "Name");
		System.out.println(obj);
		
		frog obj1 = new frog(521, "AName");
		System.out.println(obj1);

		
		
	}

}
