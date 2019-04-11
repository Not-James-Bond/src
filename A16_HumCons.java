/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

import java.util.Scanner;

public class A16_HumCons 
{
		String name;
		String gen;
		Scanner scan = new Scanner(System.in);
		A16_HumCons(String name,String gen)
		{
			System.out.print("Human Constructor\n");
			this.name=name;
			this.gen=gen;
		}
		void display()
		{
				System.out.println("\nName: " + name);
				System.out.println("\nGender: " + gen);
		}
		class student extends A16_HumCons
		{
			String sec,cou;
			Scanner scan = new Scanner(System.in);
			student(String n,String g,String sec,String cou)
			{
				super(n,g);
				System.out.print("Student Constructor\n");
				this.sec=sec;
				this.cou=cou;
			}
			void display()
			{
				super.display();
				System.out.println("\nSection: " + sec);
				System.out.println("\nCourse: " + cou);
			}
		}
		public static void main(String args[])
		{
			A16_HumCons a=new A16_HumCons("14_Feb","Male");
			student S=a.new student("Bajrang_Dal","Male","B","BCA");
			S.display();
		}
}

