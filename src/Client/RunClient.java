package Client;

import java.io.IOException;

public class RunClient
{
  public static void main(String[] args) throws IOException
  {
    Client client = new ClientImpl();
    client.startClient();
    System.out.println("Client started");
  }
}
