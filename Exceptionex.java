package com.sample.com;
import java.util.*;
public class Exceptionex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numerator");
		int num=sc.nextInt();
		
		System.out.println("Enter denominator");
		int den=sc.nextInt();
		
		try {
		System.out.println(num/den);
		System.out.println("Hello");
	
		}
		
		
			
		catch(Exception e)//Exception name in catch block must match with type of exception if(NullPinterException e) exception not handled
		{ 
			System.out.println(e);// gives description about the exception
			//System.out.println("Denominator cannot be zero");
			//System.out.println(e.getMessage());
			//e.printStackTrace(); //name,description and location of exception
		}
		/*catch(ArithmeticException e) {
			first catch block will automatically called ,,if wee reverse the order both  catch will implemented
			}
			*/
		
		//System.out.println("Hello");
	}

}
