import java.net.*;
import java.io.*;

public class Server
{
    // initialize socket and input stream
    private Socket          socket   = null;
    private ServerSocket    server   = null;

    // constructor with port
    public Server(String ipAddress, int port)
    {
        try
        {
            // Create an InetAddress object from the provided IP address
            InetAddress address = InetAddress.getByName(ipAddress);
            
            // Bind the ServerSocket to the specified IP address and port
            server = new ServerSocket(port, 50, address);
            System.out.println("Server started on " + ipAddress + ":" + port);
 
            System.out.println("Waiting for a client ...");
 
            socket = server.accept();
            System.out.println("Client accepted");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = "";

            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                try
                {
                    line = in.readLine();
                    System.out.println(line);

                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        // Update the IP address here
        Server server = new Server("192.168.56.1", 5000);
    }
}
