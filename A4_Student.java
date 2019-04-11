/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 4 :Write a java program and accept following details of a student: Name, address, contact no, course and percentage in last exam passed.
*/

import java.util.Scanner;
public class A4_Student 
{

	String name,add,course;
	int contact;
	float percentage;
	Scanner scan=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter the Details: ");
	    name=scan.nextLine();
		add=scan.nextLine();
		course=scan.nextLine();
		contact=scan.nextInt();	
		percentage=scan.nextFloat();
	}
	void display()
	{
		System.out.println("\nName: "   +name +"\nAdd: " +add+"\nCourse: " +course+ "\nContact: " +contact+"\nPercentage: "+percentage);
	}
	public static void main(String args[])
	{
		A4_Student w=new A4_Student();
		w.accept();
		w.display();
	}
	
}
