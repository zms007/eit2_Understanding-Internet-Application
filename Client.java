// A Java program for a Client
import java.net.*;
import java.io.*;
 
public class Client
{
    // initialize socket and input output streams
    private Socket socket            = null;
    private BufferedReader  input   = null;
    private PrintWriter  out     = null;
 
    // constructor to put ip address and port
    public Client(String address, int port)
    {
        // establish a connection
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal
            input = new BufferedReader(new InputStreamReader(System.in));             
            // sends output to the socket
            out    = new PrintWriter (new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        }
        catch(UnknownHostException u)
        {
            System.out.println(u);
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
 
        // string to read message from input
        String line = "";
 
        // keep reading until "Over" is input
        while (!line.equals("Over"))
        {
            try
            {
                line = input.readLine();
                out.println(line);

            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }
 
        // close the connection
        try
        {
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        // Update the IP address here
        Client client = new Client("192.168.56.1", 5000);
    }
}
