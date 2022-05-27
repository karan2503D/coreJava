
public class stringBuilderAndFormatting {

	// Strings
	public static void main(String[] args) {
		
		// Wrong way of doing
		String info = "";
		info += "Name id boc";
		info += " ";
		info += "Texr";
		System.out.println(info);
		
		// String Builder Object
		StringBuilder sb= new StringBuilder("");
		sb.append("Name is");
		sb.append(" ");
		sb.append("Text");
		sb.append(" ");
		sb.append("Test");
		System.out.println(sb);
		
		// Another Way is
		StringBuilder s= new StringBuilder();
		s.append("Text")
		.append(" ")
		.append("Test");
		
		System.out.println(s);
		
		// Formatting
		
		System.out.println("Here is soem text.\tThat is a tab\nThat is new line");
		
		System.out.printf("total cost %d ; quantity is  %d\n", 5, 120);
		
		for(int i=0; i<12 ; i++) {
			// This align Right
			System.out.printf("%2d: Value is\n", i);
			
			// This align left
			System.out.printf("%-2d: %s\n", i, "Value is");
		}
		
		// Floating Point Formating
		System.out.printf("Floating Formnatter %.2f\n", 5.6 );
		
	}

}
