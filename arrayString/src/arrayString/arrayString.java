package arrayString;

public class arrayString {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0]="Hellow";
		words[1]="World";
		words[2]="Test";
		
		System.out.println(words[2]);
		
		// OR
		
		String[] fruits = { "A","B","O" };
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		int value = 0;
		String text = null;
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		texts[0]="One";
		

	}

}
