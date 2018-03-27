package main.java;

public class Address {
	int id;
	String zip;
	String country;
	String state;
	String city;
	String line1;
	String line2;
	
	public Address(int id, String zip, String country, String state, String city, String line1, String line2) {
		super();
		this.zip = zip;
		this.country = country;
		this.state = state;
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
	}
	
	@Override
	public String toString() {
		return this.zip +" "+this.country;
	}
	

	
}
