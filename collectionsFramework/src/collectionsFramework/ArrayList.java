package collectionsFramework;
import java.util.*;
import java.io.*;  

public class ArrayList {

	public static void main(String[] args) {
		// Save Duplicates in List and Insertion order amd Null insertion is also possible 
		// ArrayList 
		int b = 10;
		int[] num = new int[5];
		num[0]= 74; // In Array we can not store string because only homogenous data goes
		System.out.println("Array List");
		
		int n = 5;
		List al = new java.util.ArrayList();
		al.add(n);
		al.add(1);
		al.add(2);
		al.add("String In Array List");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
	}

}
