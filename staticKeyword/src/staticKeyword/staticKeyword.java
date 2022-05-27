package staticKeyword;

class Thing{
	public String name;
	public static String desc;
	// Static member variables can not access with class object
	
	public static void showName() {
		// Static Methods can access static data
		System.out.println(desc);
	}
}

public class staticKeyword {

	public static void main(String[] args) {
		
		Thing thin1 = new Thing();
		Thing thin2 = new Thing();
		
		thin1.name	= "A";
		thin2.name	= "B";
		
		System.out.println(thin1.name);
		System.out.println(thin2.name);
		
		Thing.desc = "Static Variable";
		System.out.println(Thing.desc);
		
		System.out.println(Math.PI);

		thin1.showName();
		
	}

}
