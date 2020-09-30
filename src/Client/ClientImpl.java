package Client;
import Model.Coffeepot;
import Server.Transfer;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientImpl implements Client
{
  private ClientHandler handler;
  @Override public void startClient() throws IOException
  {
    Socket socket = new Socket("localhost", 9999);
    this.handler = new ClientHandler(socket,this);
    System.out.println("Client started");

    try
    {
      while (true)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter color of your coffeepot");
        String color = scanner.nextLine();
        System.out.println("Please enter capacity of your coffeepot");
        String capacity = scanner.nextLine();
        Coffeepot coffeepot = new Coffeepot(color, Double.parseDouble(capacity));
        Transfer transferObjects = Transfer.getInstance();
        transferObjects.writeToJson(coffeepot);
        System.out.println("Client is done");
        socket.close();
        break;
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

}