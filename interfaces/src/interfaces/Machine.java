package interfaces;

public class Machine implements Info {
	
	private int Id = 7;
	
	public void Start() {
		System.out.println("Machine Started");
	}

	@Override
	public void showInfo() {
		
		System.out.println("Machine id" + Id);
		
	}

}
