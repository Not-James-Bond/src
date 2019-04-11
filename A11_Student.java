/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

import java.util.Scanner;
public class A11_Student 
{
		int rno;
		String name;
		Scanner scan = new Scanner(System.in);
		A11_Student()
		{
			name="NULL";
			rno=0;
		}
		void accept() 
		{
			System.out.println("Enter The Name: ");
			name=scan.nextLine();
			System.out.println("Enter The R_no: ");
			rno=scan.nextInt();
		}
		void display()
		{
				System.out.println("\nName: " + name);
				System.out.println("\nR_no: " + rno);
		}
		public static void main(String args[])
		{
			A11_Student S =new A11_Student();
			S.accept();
			S.display();
		}
}

