//comparator
package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;  

class Employee1
{
	private int empID;
	private String employeeName;
	private int salary;
	//constructors
	public Employee1(int empID, String employeeName, int salary) {
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
	
	
}


class Idcomparator implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		if(e1.getEmpID()==e2.getEmpID())
		{
			return(0);
		}
		else
		{
			if(e1.getEmpID()>e2.getEmpID())
			{
				return(1);
			}
			else
			{
				return(-1);
			}
		}
	}
}

class Namecomparator implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		return(e1.getEmployeeName().compareTo(e2.getEmployeeName()));
	}
}

class Salarycomparator implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		if(e1.getSalary()==e2.getSalary())
		{
			return(0);
		}
		else
		{
			if(e1.getSalary()>e2.getSalary())
			{
				return(1);
			}
			else
			{
				return(-1);
			}
		}
	}
}







public class EmployeeMain1 {
	public static void main(String[] args) {
		int ch;
		ArrayList<Employee1> arr=new ArrayList<Employee1>();
		Scanner sc=new Scanner(System.in);
		arr.add(new Employee1(4,"virat",50000));
		arr.add(new Employee1(1,"Arun",12000));
		arr.add(new Employee1(2,"Sachin",15000));
		arr.add(new Employee1(3,"Rohith",20000));
		arr.add(new Employee1(5,"Rahul",20000));
		System.out.println("---------Before Sorting---------");
		for(Employee1 e:arr)
		{
			System.out.println("ID:"+e.getEmpID());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
		System.out.println("Sorting method:\n1.ID\n2.Name\n3.Salary");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Sorting by ID");
				    Collections.sort(arr,new Idcomparator());
					break;
			case 2: System.out.println("Sorting by Name");
					Collections.sort(arr,new Namecomparator());
					break;
			case 3: System.out.println("Sorting by Salary");
					Collections.sort(arr,new Salarycomparator());
					break;
			default:System.out.println("Invalid choice!!!");
					System.exit(1);
		}
		System.out.println("\n------------After Sorting---------");
		for(Employee1 e:arr)
		{
			System.out.println("ID:"+e.getEmpID());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
		
	}

}
