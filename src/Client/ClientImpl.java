package Client;

import Model.Coffeepot;

import java.io.IOException;
import java.net.Socket;

public class ClientImpl implements Client
{
  private ClientHandler handler;
  private Coffeepot coffeepot;

  @Override public void startClient() throws IOException
  {
    Socket socket = new Socket("localhost", 9999);
    this.handler = new ClientHandler(socket,this);

  }

  @Override public String getCoffeepot()
  {
    return coffeepot.toString();
  }
}
