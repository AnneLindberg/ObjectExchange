package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerHandler implements Runnable
{
  private Socket socket;
  private ObjectInputStream inFromClient;
  private ObjectOutputStream outToClient;

  public ServerHandler(Socket socket)
  {
    this.socket = socket;

    try
    {
      inFromClient = new ObjectInputStream(socket.getInputStream());
      outToClient = new ObjectOutputStream(socket.getOutputStream());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  @Override public void run()
  {
    while (true)
    {

    }
  }
}