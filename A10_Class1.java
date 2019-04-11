/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Classes and Objects
 *Question 10:Write a java program, create class Maths and perform addition, division, multiplication  and subtraction through different methods of class.pass values to the instance variable through constructor.  Create main and call all the methods
*/

public class A10_Class1 {
	int a,b;
	
    A10_Class1(int x,int y)
    {
    	a=x;
    	b=y;
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
    	System.out.println("Divison: " + (a/b));
    }
    public static void main(String args[])
    {
    	A10_Class1 C1 = new A10_Class1(10,5);
    	C1.add();
    	C1.sub();
    	C1.mult();
    	C1.div();
    }
}
