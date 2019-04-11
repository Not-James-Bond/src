/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Arrays
 *Question 14:Write  java program use variable length multidimensional arrays  to generate following output:
   1
   22
   333
   4444	
   55555
   666666
   7777777
*/

import java.util.Scanner;
public class A14_Pattern 
{
		int[] ar = new int[10];
		int k=1;
		Scanner scan = new Scanner(System.in);
		   
		void display()
		{
			for ( int i=0 ; i<7 ; i++ )
			{
				for ( int j=0 ; j<k ; j++)
				{
				System.out.print(" " + k);
				}
				System.out.println();
				k++;
			}
		}
		public static void main(String args[])
		{
			A14_Pattern S =new A14_Pattern();
			S.display();
		}
}

