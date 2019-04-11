/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Basic java Programs
 *Question 2 :Write a java program to display command line arguments that are passed at the time
  of execution and if no arguments are passed than display “No argument” message on command 
  prompt.[Command_Arg.java]
*/

final class A17_Immutable 
{ 
    final String name; 
    final int regNo; 
  
    A17_Immutable(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    String getName() 
    { 
        return name; 
    }
    int getRegNo() 
    { 
        return regNo;
    }
    public static void main(String args[])
    {
    	A17_Immutable a = new A17_Immutable()
    }
    
}