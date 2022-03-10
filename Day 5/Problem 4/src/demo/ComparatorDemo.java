package demo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
	List<String> list = new LinkedList<>();
		
		list.add("Shubham");
		list.add("Rahul");
		list.add("Rohan");
		list.add("Akash");
		list.add("Rakesh");
		list.add("Aman");
		list.add("Vishal");
		list.add("Vinod");
		list.add("Dinesh");
		
		
		  Collection.sort(list, (a, b) -> a.name.compareToIgnoreCase(b.name));
	        System.out.println(list);

	}

}
