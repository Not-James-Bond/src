/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Java Library (Streams)
 *Question 29:Write a java program read and write string in a file.
   [Use both byte and character stream]
 */
import java.io.*;
import java.util.Scanner;

public class A29_StringBuffer
{
FileInputStream in;

File f1;
FileOutputStream out;


A29_StringBuffer()throws IOException
{
    f1 = new File("D:\\Kabhi_Kabhi_Padhai\\Code\\Java","My_file.doc");
    out = new FileOutputStream(f1,true);
    in = new FileInputStream(f1);
}
void write_file() throws IOException
{
	String d = "this is my file";
	byte c[] = d.getBytes();
	for(int i=0;i<c.length;i++){
	 out.write(c[i]);
	}
	System.out.println("data written in file");
	out.close();
}

void read_file() throws IOException
{

    int t_bytes = in.available();
    for(int i=0;i<t_bytes;i++)
    {
	char d=(char)in.read();
        System.out.print(d);
    }
    System.out.println(" ");
    System.out.println("-----------reach end of file----------");
    in.close();
}
public static void main(String args[]) throws IOException
{
    A29_StringBuffer f1 = new A29_StringBuffer();
    System.out.println("writing files through file Input stream class");
    f1.write_file();
    System.out.println(" ");
    System.out.println("Reading files through file Output stream class");
    f1.read_file();
}
}
