/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Inheritance
 *Question 15:Write a java program, create a class Human [Data Member: Name, Gender] inherit student class [RollNo, course]. Both the classes should contain accept()[for accepting data] and display() [for displaying data]. Use super keyword to call constructor and hidden members.
*/

import java.util.Scanner;
public class A15_Human 
{
		String name;
		String gen;
		Scanner scan = new Scanner(System.in);
		A15_Human()
		{
			System.out.print("Human Constructor\n");
			name="NULL";
			gen="NULL";
		}
		void accept() 
		{
			System.out.println("Enter The Name: ");
			name=scan.nextLine();
			System.out.println("Enter The Gender: ");
			gen=scan.nextLine();
		}
		void display()
		{
				System.out.println("\nName: " + name);
				System.out.println("\nGender: " + gen);
		}
		class student extends A15_Human
		{
			String sec;
			Scanner scan = new Scanner(System.in);
			student()
			{
				super();
				System.out.print("Student Constructor\n");
				name="NULL";
				gen="NULL";
				sec="NULL";
			}
			void accept() 
			{
				super.accept();
				System.out.println("Enter The Section: ");
				sec=scan.nextLine();
			}
			void display()
			{
				super.display();
				System.out.println("\nSection: " + sec);
			}
		}
		public static void main(String args[])
		{
			A15_Human a=new A15_Human();
			student S=a.new student();
			S.accept();
			S.display();
		}
}

