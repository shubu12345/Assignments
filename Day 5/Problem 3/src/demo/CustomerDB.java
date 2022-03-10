package demo;

import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
	
	static Map<Integer, Customer> db;
	static {
		db = new HashMap<Integer, Customer>();
		db.put(100, new Customer(100, "Shubham", "Belgaum",10000));
		db.put(101, new Customer(101, "Rahul", "Banglore",20000));
		db.put(102, new Customer(102, "Ramesh", "Hydrabad",30000));
		db.put(103, new Customer(103, "Pavan", "Banglore",40000));
		db.put(104, new Customer(104, "Aman", "Noida",50000));
		db.put(105, new Customer(105, "Tushar", "Pune",60000));
		db.put(106, new Customer(106, "Vishal", "Delhi",70000));
		db.put(107, new Customer(107, "Rohan", "Mumbai",50000));
		db.put(108, new Customer(108, "Akash", "Hyderabad",80000));
		db.put(109, new Customer(1009, "Vinod", "Pune",90000));
	}

}
