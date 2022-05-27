package accessableTypes;

public class oak extends plant {
	public oak() {
		// type = "Plant";  Not accessible because of private
		this.size = "Large";
	}
}
