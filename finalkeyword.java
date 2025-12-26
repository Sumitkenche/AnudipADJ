package com.sample.com;
import java.util.*;


public class finalkeyword {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

		try {
		    int a = 10 / 0;
		    System.out.println("ans:"+a);
		} catch (Exception e) {
		    System.out.println(e);
		} finally {//this block always executes independent of exception
		    System.out.println("Always executed");
		    sc.close();//to close local variable sc.
		}

	}

}
