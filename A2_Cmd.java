/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[A2_Cmd.java]
*/

public class A2_Cmd
{
	public static void main(String args[])
	{
		for(String ar:args)  
		{
			System.out.println(ar);
		}
	}

}
