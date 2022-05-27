package multiDimensional;

public class multiDeimensional {

	public static void main(String[] args) {
		
		// MultiDimensional Array is Just an Array of Arrays ,
		//  Different Elements of Same array dont have to be same length
		
		int[][] grid = {
				{1,2,3,4},
				{6,5,7,8},
				{2,5}
		};
		
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hellow";
		
		for(int row=0;row<grid.length;row++) {
			for(int col=0;col<grid[row].length;col++) {
				System.out.println(grid[row] + "\t");
			}
			System.out.println();
		}
	}

}
