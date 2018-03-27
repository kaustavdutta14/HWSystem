package main.java;

public class Phone {
	
	int id;
	String areaCode;
	String number;
	String CountryCode;
	
	public Phone(int id, String areaCode, String number, String countryCode) {
		super();
		this.id = id;
		this.areaCode = areaCode;
		this.number = number;
		this.CountryCode = countryCode;
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	
	
	@Override
	public String toString() {
		return this.number;
	}
	
	
}
