package main.java;

import java.util.Date;
import java.util.List;

public class FullTime extends Employee{
		
	Date start;
	Float baseSalaryPerYear;
	Float bonusPerYear;
	
	public FullTime(int id, String firstname, String lastname, Phone phone, Address address, List<Role> roles,
			Date start, Float baseSalaryPerYear, Float bonusPerYear) {
		super(id, firstname, lastname, phone, address, roles);
		this.start = start;
		this.baseSalaryPerYear = baseSalaryPerYear;
		this.bonusPerYear = bonusPerYear;
	}
	
}
