package com.sample.com;
import java.util.*;
public class Demo {
    String name;
    int age ;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter age");
		System.out.println("Enter full name");
		int age=sc.nextInt();
		//sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Age:"+ age);
		System.out.println("Name:"+ name);
		
		
		
	}

}
 
