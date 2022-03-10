package demo;

import java.util.List;

public interface EmpDuo {
	public Emp findEmpById(int id);

	public String save(Emp e);

	public String update(Emp e);

	public String delete(int empId);

	public List<Emp> listAll();
}
