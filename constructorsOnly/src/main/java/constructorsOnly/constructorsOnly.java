package constructorsOnly;

public class constructorsOnly {

	String a,b,c;
	public void dateInitialize() {
		a=b=c=null;
	}
	public void setData(String d,String e,String f) {
		a=d;
		b=e;
		c=f;
	}
	public void displayData() {
		System.out.printf(a + b + c);
	}
	public static void main(String[] args) {
				
		constructorsOnly sd=new constructorsOnly();
		sd.setData("A", "B", "C");
		sd.displayData();
	}

}
