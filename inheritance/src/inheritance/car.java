package inheritance;

public class car extends machine {
	// Overriding method
	/* public void start() {
		System.out.println("Car Started");
	} */
	
	public void wipewind() {
		System.out.println("Wipe Wind");
	}

	@Override // It will Check it is properly override
	public void start() {
		System.out.println("Car Started");
	}
}
