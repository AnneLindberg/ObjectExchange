package Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable
{
  private Socket socket;
  private Client client;
  private ObjectInputStream inFromServer;
  private ObjectOutputStream outToServer;

  public ClientHandler(Socket socket, Client client)
  {
    this.socket = socket;
    this.client = client;

    try
    {
      outToServer = new ObjectOutputStream(socket.getOutputStream());
      inFromServer = new ObjectInputStream(socket.getInputStream());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void run()
  {
    try
    {
      while (true)
      {

      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}