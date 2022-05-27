package collectionsFramework;
import java.util.*; 

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj= new LinkedList<>();
		for(int i=1;i<=5;i++)
			obj.add(i);		
		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);
		
		// Printing Elements One by One
		for(int i=0;i<obj.size();i++)
			System.out.println(obj.get(i));
	}

}
