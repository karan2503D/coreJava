package tostringMethod;

public class tostringMethod {

	private int stuId;
	private String stuName;
	private double stuMarks;
	
	public int getStuId() {
		return stuId;
	}



	public void setStuId(int stuId) {
		this.stuId = stuId;
	}



	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public double getStuMarks() {
		return stuMarks;
	}

	public void setStuMarks(double stuMarks) {
		this.stuMarks = stuMarks;
	}

	public tostringMethod() {
		stuId = 101;
		stuName = "name";
		stuMarks = 78.29;
	}
	public tostringMethod(int stuId, String stuName, double stuMarks) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}
	public void display() {
		System.out.println("Student Id " + stuId );
		System.out.println("Student Name " + stuName );
		System.out.println("Student Marks " + stuMarks );
	}
	public String toString() {
		return "Name:" + " " + stuName + " " + "Id:" + " " + stuId + " " + "Marks:" + " " + stuMarks;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tostringMethod tsm = new tostringMethod();
		System.out.println(tsm.toString());
		
		// using getter in main method
		String name = tsm.getStuName();
		System.out.println(name);
		
		tostringMethod tsm1 = new tostringMethod(1101,"Text" , 2540.25);
		System.out.println(tsm1.toString());
		
		tsm1.setStuName("Text 1");
		System.out.println("After set value of name changed" + tsm1.getStuName());
		
		
		
	}

}
