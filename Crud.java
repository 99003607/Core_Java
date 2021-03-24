package com.ltts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudApp {
	static HashMap<Integer,String> h=new HashMap<Integer,String>();
	static Scanner sc=new Scanner(System.in);
	//create
	static void create()
	{
		int key;
		String value;
		System.out.println("Enter key:");
		key=sc.nextInt();
		System.out.println("Enter value:");
		value=sc.next();
		h.put(key, value);
	}
	//display
	static void display()
	{
		System.out.println("Key->value");
		for(Map.Entry m : h.entrySet())
		{    
			System.out.println(m.getKey()+" -> "+m.getValue());    
	    }
	}
	 //update
	static void update()
	{
		int key;
		String value;
		System.out.println("Current HashMap");
		display();
		System.out.println("Enter the key to update");
		key=sc.nextInt();
		System.out.println("Enter the value to update");
		value=sc.next();
		h.put(key, value);
		
	}
	//delete
	static void delete()
	{
		int key;
		System.out.println("Current HashMap");
		display();
		System.out.println("Enter the key to delete");
		key=sc.nextInt();
		h.remove(key);
	}
	
	public static void main(String[] args) {
		int ch;
		System.out.println("----Welcome to the CRUD apllication----");
		do
		{
			System.out.println("\n1.Create \n2.Read \n3.Update \n4.Delete \n5.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("----Create----");
						create();
			 			break;
				case 2: System.out.println("----Read----");
						display();
			 			break;
				case 3: System.out.println("----Update----");
						update();
			 			break;
				case 4: System.out.println("----Delete----");
						delete();
			 			break;
				case 5: System.out.println("----Exiting----");
						break;
				default: System.out.println("Invalid choice!!!");
						 System.out.println("Please renter your choice");
					
		    }
		}while(ch!=5);
		
	}

}
