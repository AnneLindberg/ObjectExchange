package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImpl implements Server, Runnable
{
  private ObjectInputStream inFromClient;
  private ObjectOutputStream outToClient;

  @Override public void start() throws IOException
  {
    ServerSocket welcomeSocket = new ServerSocket(9999);
    System.out.println("Server started ... ");

    while (true)
    {
      Socket socket = welcomeSocket.accept();
      System.out.println("Client connected");

      try
      {
        inFromClient = new ObjectInputStream(socket.getInputStream());
        outToClient = new ObjectOutputStream(socket.getOutputStream());
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }

    }
  }

  @Override public void run()
  {

  }
}
