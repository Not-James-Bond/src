/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Exception Handling
 *Question 21:In Q15 accept age in student class. If age is less than 0 or more than 100 raise Illegal_Age().
*/

import java.util.Scanner;

class IllegalAge extends Exception
{
    IllegalAge()
    {
      System.out.println("Wrong  age");
    }
}
public class A21_EHandle2 
{
    int age;
    Scanner s=new Scanner(System.in);
    void accept()
    {   
        
        try
        {  System.out.println("Enter age:");
            age=s.nextInt();
            if(age>100||age<=0)
            {
                throw new IllegalAge();
            }
        }
        catch(IllegalAge e)
        {
            accept();
        }
    }
    void display()
    {
        System.out.print("Age="+age);
    }
    public static void main(String ar[])
    {
         A21_EHandle2 s=new A21_EHandle2();
         s.accept();
         s.display();
    }
}
