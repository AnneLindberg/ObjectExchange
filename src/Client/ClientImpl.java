package Client;

import java.io.IOException;
import java.net.Socket;

public class ClientImpl implements Client
{
  private ClientHandler handler;

  @Override public void startClient() throws IOException
  {
    Socket socket = new Socket("localhost", 9999);
    this.handler = new ClientHandler(socket,this);

  }
}
