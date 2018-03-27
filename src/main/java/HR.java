package main.java;

import java.util.ArrayList;
import java.util.List;

public class HR {
		
	static Company company;
	static List<Employee> employees = new ArrayList<>();
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		HR.company = company;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		HR.employees = employees;
	}
	
	public HR() {
		
	}

	public HR(Company company, List<Employee> employees) {
		super();
		HR.company = company;
		HR.employees = employees;
	}
	
}
