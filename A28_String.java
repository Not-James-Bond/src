/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :String and StringBuffer
 *Question 28:Create a class called MyString : Declare two string type variables:
  str1 (“ Welcome to Java tutorial”)  and str2(“Todays topic is String Handling in Java”).
  Perform following operations in this class:
	  Concatenate two strings
	  Covert str1 into lower case
	  Covert str2 into upper case
  	Are both equal to each other
 	  Show the location of “J” in  both str1 and str2
 	  Replace “i” with “I” in both the strings
 	  display “java” from str string
 	  Display the 7th character in str1.
	  Convert str1 into string array
*/

import java.util.Scanner;

public class A28_String
{
  public static void main(String[] args)
  {
	String s1="Welcome to Java tutorial";
	String s2="Todays topic is String Handling in Java";
	int z,x,i,j;
    System.out.println(s1.concat(s2));
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    if(s1.equals(s2))
    System.out.println("Both Strings are Equal");
    else
    System.out.println("Both Strings are Not Equal");
    z=s1.lastIndexOf('J');
    x=s2.lastIndexOf('J');
    System.out.println(" Location in String 1: "+ z );
    System.out.println(" Location in String 2: "+ x );
    s1=s1.replace('i','I');
    s2=s2.replace('i','I');
    System.out.println(s1);
    System.out.println(s2);
    String str4=s1.substring(11,15);
    System.out.println(str4);
    char s=s1.charAt(7);
    System.out.println(s);
    String[] str5=s1.split("");
    for(i=0;i<str5.length;i++)
    {
      System.out.print(str5[i]);
    }
  }
}
