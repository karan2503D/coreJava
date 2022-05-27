package collectionsFramework;
import java.util.*;

public class TreeSet {

	public static void main(String[] args) {
		
		 java.util.TreeSet<String> ts = new java.util.TreeSet<String>();
		 ts.add("Text1");
		 ts.add("Text2as");
		 ts.add("Teasxt3");
		 ts.add("Textasdsa4");
		 ts.add("Teffxt5");
		 
		 Iterator<String> ir= ts.iterator();
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }

	}

}
