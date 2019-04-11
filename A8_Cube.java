/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

public class A8_Cube {
void cub()
{
	for (int i=1;i<=10;i++)
	{
		System.out.print(i*i*i + " ");
	}
}
public static void main(String args[])
{
	A8_Cube T = new A8_Cube();
	T.cub();
}
}
