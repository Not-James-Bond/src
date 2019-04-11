/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Multithreading
 *Question 25:Write  java program create a multithreaded program(2 threads),
   Main thread will print Values from 1-100 and child thread will print tables
   from 2-5. [Use Runnable interface]
*/

public class A25_Threads implements Runnable {
  public static void main(String[] args)
	{
	       A25_Threads t1=new   A25_Threads();
	       for(int i=1;i<=30;i++)
	       {
	    	   System.out.print(i+" ");
	       }
	       System.out.println(" ");
		t1.run();
                        }

	public void run()
	{
		for(int i=2;i<=5;i++)
		{   System.out.print("Table of "+i+" :");
			for(int j=1;j<=10;j++)
			{
				System.out.print(j*i+" ");
			}
			System.out.println(" ");
		}
	}

}
