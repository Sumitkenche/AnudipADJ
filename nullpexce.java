package com.sample.com;
import java.util.*;
public class nullpexce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=null;
		
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}
