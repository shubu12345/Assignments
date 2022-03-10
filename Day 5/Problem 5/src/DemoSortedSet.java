
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSet {

	public static void main(String[] args) {
		
	SortedSet set = new TreeSet();
		
		set.add("Delhi");
		set.add("Hydrabad");
		set.add("Kolkata");
		set.add("Mumbai");
		set.add("Pune");
		set.add("Banglore");
		set.add("Punjab");
		set.add("Dharward");
		set.add("Amrithsar");
	
	     for (Object sort : set) {  
             System.out.println(sort);  
               }  

	}

}
