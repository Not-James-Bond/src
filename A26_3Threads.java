/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Multithreading
 *Question 26:Write  java program create a multithreaded program(3 threads),
   Main thread will print Values from 1-100 and Ist child thread will print
	 tables from 2-5 and IInd child thread will print “A-Z” [Use Thread class]   
*/

public class A26_3Threads {
	public static void main(String[] args)
	{ Thread t1=Thread.currentThread();
    System.out.println(t1);
    for(int i=1;i<=30;i++)
    {
 	   System.out.print(i+" ");
    }
    	Child1 t2= new Child1();
     t2.start();
     System.out.println(" ");
     ChildThread4 t3=new ChildThread4();
     t3.start();

	}

}

class Child1 extends Thread
{
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
class ChildThread4 extends Thread
{
	public void run()
	{
		for(char i='A';i<='Z';i++)
		{  System.out.print(i +" ");
		}
	}
}
