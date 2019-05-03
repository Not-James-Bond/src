import java.net.*;
import java.io.*;

public class TCPClient {

  public static void main(String[] args) {

    Socket theSocket;
    String hostname;
    DataInputStream theInputStream; // reading from socket
    DataInputStream userInput; // reading from keyboard
    PrintStream theOutputStream; // writing on socket
    String theLine;

    if (args.length > 0) {
      hostname = args[0];
    }
    else {
      hostname = "localhost";
    }

    try {
      theSocket = new Socket("172.16.1.147", 9999);
       System.out.println(hostname + ": connected with server: 192.168.1.2 ");
       System.out.println(hostname + ": can starrt interaction with client ");
      theInputStream = new DataInputStream(theSocket.getInputStream());
      theOutputStream = new PrintStream(theSocket.getOutputStream());
      userInput = new DataInputStream(System.in);
      while (true) {
        theLine = userInput.readLine();
        if (theLine.equals(".")) break;
        theOutputStream.println(theLine);
        System.out.println(theInputStream.readLine());
      }
    }  // end try
    catch (UnknownHostException e) {
      System.err.println(e);
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }  // end main

}  // end echoClient

