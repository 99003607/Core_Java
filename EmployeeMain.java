//Comparable
package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>
{
	private int empID;
	private String employeeName;
	private int salary;
	//constructor
	public Employee(int empID, String employeeName, int salary) {
		this.empID = empID;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	//getters and setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		/*if(employeeName.equals(e.employeeName))
		{
			return(0);
		}*/
		return(employeeName.compareTo(e.employeeName));
		//return 0;
	}
	
	
}


public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee(4,"virat",50000));
		arr.add(new Employee(1,"Arun",12000));
		arr.add(new Employee(2,"Sachin",15000));
		arr.add(new Employee(3,"Rohith",20000));
		arr.add(new Employee(5,"Rahul",20000));
		System.out.println("---------Before Sorting---------");
		for(Employee e:arr)
		{
			System.out.println("ID:"+e.getEmpID());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
		Collections.sort(arr);
		System.out.println("\n------------After Sorting---------");
		for(Employee e:arr)
		{
			System.out.println("ID:"+e.getEmpID());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
	}

}
