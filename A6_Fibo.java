/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

public class A6_Fibo {
int a,b,c;
A6_Fibo()
{
	a=0;
	b=1;
	c=1;
}
void calc()
{
	System.out.print("0 ");
	System.out.print("1 ");
	for (int i=2;i<20;i++)
	{   c=b;
		b=a+b;
		System.out.print(b + " ");
		a=c;	
	}
}
public static void main(String args[])
{
	A6_Fibo F = new A6_Fibo();
	F.calc();
}
}
