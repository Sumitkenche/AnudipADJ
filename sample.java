package com.sample.com;

class sample {  
    int roll;
    String name;
    public sample(int roll,String name)
    {
    	this.roll=roll;
    	this.name=name;
    }
    
    void display()
    {
    	System.out.println("Roll -no:"+roll+" name "+name);
    }

  public static void main(String args[])
{
	  sample s1=new sample(101,"Sumit");
	  s1.display();
}
}

