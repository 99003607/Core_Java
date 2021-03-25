/*
 * Question 3
 */
package com.ltts;

import java.util.Scanner;

class CustomException extends Exception
{
    CustomException()
    {
        System.out.println("CustomException: InvalidAgeRangeException");
    }
}

public class Q3 {
	public static void main(String[] args) throws CustomException {
		String pname;
		int page;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name:");
		pname=sc.nextLine();
		System.out.println("Enter the player age:");
		page=sc.nextInt();
		if(page<19)
		{
		    throw new CustomException();
		}
		else
		{
		   System.out.println("Player name:"+pname);
		   System.out.println("Player age:"+page); 
		}
		
	}

}
