/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Multithreading
 *Question 24:Write  java program create a multithreaded program(2 threads),
   Main thread will print Values from 1-100 and child thread will print tables
	 from 2-5. [Use Thread class]
*/
public class A24_Child_Threads extends Thread{
	int a;
	A24_Child_Threads()
	{
		start();
	}
	public void run()
	{
		for( int i=2 ;i>=2 && i<=5; i++)
		{
			System.out.print("\nTable of " + i + " : ");
			for ( int j=1 ; j<=10 ; j++)
			{
				System.out.print((j*i) + " ");
			}
		}
	}
	public static void main(String args[])
	{
		A24_Child_Threads c= new A24_Child_Threads();
		for (int k=1 ; k<=30 ; k++)
		{
			System.out.print(k + " ");
		}
	}
}
