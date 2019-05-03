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
// As long as we receive data, echo that data back to the client.
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






