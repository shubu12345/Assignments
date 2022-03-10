package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CustomerApp {
	public CustomerApp() {
		
	}
	
	public String findCustomer(int customerId) {
		if(CustomerDB.db.containsKey(customerId)) {
			return CustomerDB.db.get(customerId).getDetails();
		}else {
			return "No Data found";
		}
	}
	
	public List<String> listPersonByCity(String name) {

		List<String> persons = new ArrayList<String>();
		
		Set<Integer> keys = CustomerDB.db.keySet();
		
		for (Integer key : keys) {
			Customer p = CustomerDB.db.get(key);
			if (p.getName().equals(name))
				persons.add(p.getDetails());
		}

		return persons;
	}
	
	
	public static void main(String[] args) {
		
		String name = "Rahul";

		CustomerApp app = new CustomerApp();

		System.out.println(app.findCustomer(103));

		for (String p : app.listPersonByCity(name)) {
			System.out.println(p);
		}
	}

	}


