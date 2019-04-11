/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Exception Handling
 *Question 20:Extend Q10, In divide method of Maths class and handle  ArithmeticException using try catch block.
*/

import java.util.Scanner;



public class A20_EHandle {
	int a,b;
	
    A20_EHandle(int a,int b)
    {
    	this.a=a;
    	this.b=b;
    }
    void add()
    {
    	System.out.println("Sum: " + (a+b));
    }
    void sub()
    {
    	System.out.println("Difference: " + (a-b));
    }
    void mult()
    {
    	
    	System.out.println("Product: " + (a*b));
    }
    void div()
    { 
    	try
    	{
    		int div=a/b;
    		System.out.println("Divison: " + div);
    	}
    	catch(ArithmeticException Ex)
    	{
    		System.out.println ("Numerator divide a number by zero");
    	}
    }
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	int x,y;
    	x=scan.nextInt();
    	y=scan.nextInt();
    	A20_EHandle C1 = new A20_EHandle(x,y);
    	C1.add();
    	C1.sub();
    	C1.mult();
    	C1.div();
    }
}
