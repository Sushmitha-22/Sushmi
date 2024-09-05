package shan;

public class EmployeeManagement {      //constructor
	String name; //inititating the variables
	int empId;
	String designation;
	String companyname;
	int empExp;
	int empsal;
	
	public static void main(String[] args) {     // main method
		
		//Definie objects to show the result
		EmployeeManagement emp=new EmployeeManagement();
		emp.name=" Sushmitha ";
		emp.empId=3467823;
		emp.designation="Software engineer";
		emp.companyname=" Wipro ";
		emp.empExp=5;
		emp.empsal=45000;
		
		EmployeeManagement emp1=new EmployeeManagement();
		emp1.name="Dhanushini ";
		emp1.empId=74657586;
		emp1.designation="HR";
		emp1.companyname=" Wipro ";
		emp1.empExp=6;
		emp1.empsal=55000;
		// to print the output
		System.out.println("Name"+emp1.name);
		System.out.println("empId"+emp1.empId);
		System.out.println("designation"+emp1.designation);
		System.out.println("companyname"+emp1.companyname);
		System.out.println("empExp"+emp1.empExp);
		System.out.println("empsal"+emp1.empsal);
		
		
		
		System.out.println("Name"+emp1.name);
		System.out.println("empId"+emp1.empId);
		System.out.println("designation+emp1.designation);
		System.out.println("Companyname"+emp1.companyname);
		System.out.println("empExp"+emp1.empExp);
		System.out.println("Empsal"+emp1.empsal);
		System.out.println("empsal"+emp1.empsal);
	}
}
		
		
		
		
		
	