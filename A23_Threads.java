/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Multithreading
 *Question 23:Write a java program extract properties of main thread, also
   change name and priority of main thread.
*/
public class A23_Threads
{

	public static void main(String args[])
		{
		System.out.println("Bruce Wayne is Batman");
		Thread t = Thread.currentThread();
		System.out.print(t);
		t.setName("Clark Kent");
		t.setPriority(2);
		System.out.print(t);
		}
}
