package collectionsFramework;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		// Add in stack
		Stack st = new Stack<>();
		st.push(1);
		st.push(3);
		st.push(3);
		st.push(1);
		// Assign Stack to Iterator
		Iterator itr= st.iterator();
		// Print Values in stack
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Add a break operation in between
		System.out.println();
		
		// Remove 1 element from stack
		 st.pop();
		// Assign Iterator
		 itr = st.iterator();
		// Print Values in stack
		 while(itr.hasNext()) {
		 System.out.println(itr.next());
		 }
		
		

	}

}
