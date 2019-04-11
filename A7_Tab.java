/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Looping and Operator
 *Question 7 :Write a java program to display table of 1 to 10.
*/

public class A7_Tab {
void tab()
{
	for (int i=1;i<=10;i++)
	{
		System.out.print("\nTable of " + i +": ");
		for(int j=1;j<=10;j++)
		{
			System.out.print(i*j + " ");
		}
	}
}
public static void main(String args[])
{
	A7_Tab T = new A7_Tab();
	T.tab();
}
}
