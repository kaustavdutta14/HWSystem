package main.java;

import java.util.Date;
import java.util.List;

public class Contractor extends Employee {
	
	Date start;
	Date end;
	Float hourlyRate;
	public Contractor(int id, String firstname, String lastname, Phone phone, Address address, List<Role> roles,
			Date start, Date end, Float hourlyRate) {
		
		super(id, firstname, lastname, phone, address, roles);
		this.start = start;
		this.end = end;
		this.hourlyRate = hourlyRate;
	}

	
}
