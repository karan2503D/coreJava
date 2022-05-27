package polymorphism;

public class polymorphism {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		Tree tree=new Tree();
		
		// This is Called Polymorphism in action 
		Plant plant1 = plant;
		Plant plant2 = tree;
		
		plant1.grow();
		plant2.grow();
		
		// plant2.sherdLeaves()
		
		doGrow(tree);
	}

	public static  void doGrow(Plant plant) {
		plant.grow();
	}
	
}
