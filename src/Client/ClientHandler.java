package Client;

import java.io.Console;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter color of your coffeepot");
        String color = scanner.nextLine();
        System.out.println("Please enter capacity of your coffeepot");
        String capacity = scanner.nextLine();
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}