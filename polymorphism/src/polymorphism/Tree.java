package polymorphism;

public class Tree extends Plant {
	
	@Override
	public void grow() {
		System.out.println("Tree growing");
	}
	

	public void sherdLeaves() {
		System.out.println("Leaves Shearding");
	}
	
}
