package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static HRService hr = new HRService();
	public static void addEmp() {
		int end = 0;
		while(end == 0) {
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("Enter Employee First Name");
		String Fname = in.nextLine();
		
		System.out.println("Enter Employee Last Name");
		String Lname = in.nextLine();
		
		//PHONE
		System.out.println("Enter Employee Phone Number");
		String number = in.nextLine();
		
		System.out.println("Enter Employee Area Code");
		String ac = in.nextLine();
		
		System.out.println("Enter Employee Country Code");
		String cc = in.nextLine();
		
		System.out.println("Enter Employee Roles (Seperate with ',')");
		String role = in.nextLine();
		String[] ArrRoles = role.split(",");
		List<Role> roles = new ArrayList<>();
		
		for(String i: ArrRoles) {
			roles.add(new Role(1,i));
		}
		
		
		//AREA
		System.out.println("Enter Employee Zip");
		String zip = in.nextLine();
		
		System.out.println("Enter Employee Country");
		String country = in.nextLine();
		
		System.out.println("Enter Employee State");
		String state = in.nextLine();
		
		System.out.println("Enter Employee City");
		String city = in.nextLine();
		
		System.out.println("Enter Employee Address line 1");
		String line1 = in.nextLine();
		
		System.out.println("Enter Employee Address line 2");
		String line2 = in.nextLine();
		
		//Object Initilization
		Phone phone = new Phone(1,ac,number,cc);
		Address address= new Address(1,zip,country,state,city,line1,line2);
		Employee emp = new Employee(1,Fname, Lname,phone, address, roles);
		
		System.out.println("phone is "+phone);
		System.out.println("address is "+address);
		System.out.println("emp is "+emp);
		
		hr.addEmployee(emp);
		
		
		//Selection 
		System.out.println("Do you want to add more Employees 1 = Yes, 2 = No }");
		int op = in.nextInt();
		
		switch(op) {
		
		case 1:	end = 0;break;
		case 2: end = 1;break;

		default: ;
		}
	}
		
	}
	
	public static void removeEmp(String name) {
	}
	
	public static void deleteEmp(String name) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Company Name");
		String cmp = in.nextLine();
		
		Company company = new Company(1,cmp);
		
		HR.company = company;
		
		HRService hrService = new HRService();

		while(end == 0) {
		
			//Selection 
			System.out.println("Select a operation {1- addEmpDetails, 2-removeEmp, 3-searchEmp, 4-exit }");
			int op = in.nextInt();
			
			switch(op) {
			
			case 1:	addEmp();break;
			case 2: removeEmp();break;
			case 3: searchEmp();break;
			case 4: System.out.println("Exiting Program");  return;
			default: ;
			}
		}
		
	}

	private static void searchEmp() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Employees Firstname");
		String fname = in.nextLine();
		System.out.println("Enter Employees Lastname");
		String lname = in.nextLine();
		List<Employee> emp = null;
		if(hr.search(fname, lname) != null) {
			 emp = hr.search(fname,lname);
		}
		System.out.println("Employees found are "+emp);
		
	}

	private static int removeEmp() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Employees ID");
		int id = in.nextInt();
		Employee emp = null;
		if(hr.search(id) != null) {
			emp = hr.search(id);
			
			if(hr.removeEmployee(emp)>0) {
				System.out.println("Employee Deleted");
			}
		}
		
		return hr.removeEmployee(emp);
	
			
	}

}
