/*
 * Question 1
 */
package com.ltts;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		float tr,to;
		String str,sto;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the total runs scored:");
			str=sc.next();
			 tr = Integer.parseInt(str);  
			System.out.println("Enter the total overs faced:");
			sto=sc.next();
			to = Integer.parseInt(sto);  
			float rr=tr/to;
			System.out.printf("Current Run Rate:%.2f",rr);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}

}
