/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Looping and Operator
 *Question 5 :Write a java program accept % from user, if % is more than 75 the display a message “Eligible for Application” else “Not Eligible”.
*/

import java.util.Scanner;
public class A5_Percentage 
{
		int per;
		Scanner scan = new Scanner(System.in);
		A5_Percentage()
		{
			per=0;
		}
		void get() 
		{
			System.out.println("Enter The Percentage: ");
			per=scan.nextInt();
		}
		void check()
		{
			if (per>75)
				System.out.println("\nEligible");
			else
				System.out.println("\nNot Eligible");
		}
		public static void main(String args[])
		{
			A5_Percentage P =new A5_Percentage();
			P.get();
			P.check();
		}
}

