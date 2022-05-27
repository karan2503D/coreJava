package collectionsFramework;
import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<Integer, String> hs = new java.util.HashMap<Integer, String>();
		hs.put(1,"First");
		hs.put(2,"Second");
		hs.put(3,"Third");
		hs.put(4,"Fourth");
		
		System.out.println("FIRST" + hs.get(1) );
		
		for (Map.Entry<Integer, String> e : hs.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

	}

}
