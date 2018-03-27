package main.java;

import java.util.ArrayList;
import java.util.List;


public class HRService {
	
	public void addEmployee(Employee e) {
			HR.employees.add(e);
	}
	
	public int removeEmployee(Employee e) {
			
		String name = e.firstname + e.lastname;
			for(Employee emp : HR.employees) {
				if(name.equalsIgnoreCase(emp.firstname+emp.lastname)) 
					HR.employees.remove(emp);
					return 1;
			}
			return 0;
	}
	
	public List<Employee> search(String firstname, String lastname) {
			String name = firstname+lastname;
			List<Employee> emps = new ArrayList<>();
			for(Employee emp : HR.employees) {
				if(name.equalsIgnoreCase(emp.firstname+emp.lastname)) 
					emps.add(emp);
			}
			
		return (emps.isEmpty())? null: emps;
	}
	
	public Employee search(int id) {
			
		Employee emp;
		
		emp = HR.employees.get(id);
		
		if(emp != null) {
			return emp;
		}
		else {
			System.out.println("No employee found ....please modify search params");
			return null;
		}
		
	}
	
	
}
