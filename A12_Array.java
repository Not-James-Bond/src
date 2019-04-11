/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Arrays
 *Question 12:Write a java program to accept 10 numbers in an integer array, display sum of accepted numbers after displaying array contents.
*/

import java.util.Scanner;
public class A12_Array 
{
		int[] ar = new int[10];
		Scanner scan = new Scanner(System.in);
		
		void accept() 
		{
			System.out.println("Enter The Values: ");
			for ( int i=0 ; i<10 ; i++ )
			{
				ar[i]=scan.nextInt();
			}
		}
		void display()
		{
			System.out.println("Display:");
			for ( int i=0 ; i<10 ; i++ )
			{
				System.out.print(" " + ar[i]);
			}
		}
		public static void main(String args[])
		{
			A12_Array S =new A12_Array();
			S.accept();
			S.display();
		}
}

