package com.ltts.Miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
	private static final String QUERY = "select studentid,studentname from mydata where studentid=?"; 
	
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	//driver path
        Class.forName("com.mysql.jdbc.Driver"); 
        PreparedStatement st = null;
        Scanner sc=new Scanner(System.in);
        int ch;
        //connecting to the database. 
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandesh","root","1234");
        
        System.out.println("----Running first time----");
        
        //creating database
        String dname;
        String str1="create database ";
        System.out.println("Enter the database name:");
        dname=sc.next();
        String dstate=str1+dname;
        st=con.prepareStatement(dstate);
        st.execute();
        System.out.println("Created database successfully");
        dstate="use "+dname;
        st=con.prepareStatement(dstate);
        st.execute();
        System.out.println("Using database:"+dname);
       
 
         //creating table
         st=con.prepareStatement("Create table student(studentid int(3),studentname varchar(10))");
         st.execute();
         System.out.println("table is created successfully");
         
         System.out.println("----Menu----");
         System.out.println("1.Create \n2.Read \n3.Update \n4.Delete");
         System.out.println("Enter your choice");
         ch=sc.nextInt();
         switch(ch)
         {
         	case 1: //inserting value
         			st=con.prepareStatement("insert into student values(?,?)");
			 	int id;
			 	String name;
			 	System.out.println("Enter student ID:");
			 	id=sc.nextInt();
			 	System.out.println("Enter student name:");
			 	name=sc.next();
         			st.setInt(1, id);
         			st.setString(2, name);
         			st.executeUpdate();
         			System.out.println("New values inserted successfully");
         			break;
         	
         	case 2: //reading values
         			st = con.prepareStatement(QUERY); 
         			st.setInt(1, 101);
         			System.out.println(st);
         			ResultSet rs = st.executeQuery();
         			// Process the ResultSet object.
         			while (rs.next()) 
         			{
         				int studentid = rs.getInt("studentid");
         				String studentname = rs.getString("studentname");
         				System.out.println(studentid + "," + studentname);
         			}
         			break;
         	
         	case 3:  //updating values
         			PreparedStatement st12=con.prepareStatement("insert into student values(?,?)");
         			System.out.println("enter the student id");
         			int i=sc.nextInt();
         			st12.setInt(1, i );
         			System.out.println("enter the student name");
         			String s=sc.next();
         			st12.setString(2, s);
         			st12.executeUpdate();
         			System.out.println("table is updated");
         			break;
         	
         	case 4:  //deleting values
         			String query="delete from student where studentid=?";
         			st=con.prepareStatement(query);
         			System.out.println("Enter the id of the student to be deleted:");
         			String stid=sc.next();
         			st.setString(1, stid);
         			System.out.println(st);
         			int result=st.executeUpdate();
         			System.out.println("Number of records affected : " + result);
         			break;
         	
         	default: System.out.println("Invalid choice!!!!");
         			 break;
         }
         
      //closing connection
        con.close();
	}
}
