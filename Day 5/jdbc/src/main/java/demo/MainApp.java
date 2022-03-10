package demo;

public class MainApp {

	public static void main(String[] args) {
		EmpDuo dao = new EmpDaoJdbcImpl();

		Emp emp = dao.findEmpById(105);
		System.out.println(emp);

//		String response = dao.save(new Emp(107, "Dinesh", "Hyderabad", 65000));
//		System.out.println(response);
		
		String response = dao.update(emp);
		System.out.println(response);
		
		String del = dao.delete(106);
		System.out.println(del);
		

//		for (Emp e : dao.listAll()) {
//			System.out.println(e);
//		}

	}

}
