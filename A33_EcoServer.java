import java.net.*;
import java.io.*;
public class A33_EcoServer {
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
} // end try
catch (UnknownHostException e) {
System.err.println(e);
}
catch (IOException e) {
System.err.println(e);
}
} // end main
} // end echoClient
//close client code//
//server//
import java.io.*;
import java.net.*;
class TCPServer {
public static void main(String args[]) {
ServerSocket echoServer = null;
String line;
DataInputStream is; //reading from socket
PrintStream os; // writing on socket
Socket clientSocket = null;
try {
echoServer = new ServerSocket(9999);
}
catch (IOException e) {
System.out.println(e);
}
System.out.println("Server started waiting for client");
try {
clientSocket = echoServer.accept();
is = new DataInputStream(clientSocket.getInputStream());
os = new PrintStream(clientSocket.getOutputStream());
//As long as we receive data, echo that data back to the client.
while (true) {
line = is.readLine();
System.out.println(line.toUpperCase());
os.println(line.toUpperCase());
}
}
catch (IOException e) {
System.out.println(e);
}
}
}