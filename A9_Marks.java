/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

import java.util.Scanner;
public class A9_Marks 
{
		int m;
		Scanner scan = new Scanner(System.in);
		A9_Marks()
		{
			m=0;
		}
		void get() 
		{
			System.out.println("Enter The Marks: ");
			m=scan.nextInt();
		}
		void check()
		{
			if (m<0)
				System.out.println("Invalid Entry");
			else if (m>80 && m<=100)
				System.out.println("A");
			else if (m>70 && m<=80)
				System.out.println("B");
			else if (m>60 && m<=70)
				System.out.println("C");
			else if (m>50 && m<=60)
				System.out.println("E");
			else
				System.out.println("Flunk");
		}
		public static void main(String args[])
		{
			A9_Marks P = new A9_Marks();
			P.get();
			P.check();
		}
}

