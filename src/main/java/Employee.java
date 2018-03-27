package main.java;

import java.util.List;

public class Employee {
	
	static int id ;
	String firstname;
	String lastname;
	Phone phone;
	Address address;
	List<Role> roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		Employee.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public Employee(int id, String firstname, String lastname, Phone phone, Address address, List<Role> roles) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.roles = roles;
		id += 1;
	}
	
	@Override
	public String toString() {
		return this.firstname +" "+this.lastname;
	}
	
	
	
	
	

}
