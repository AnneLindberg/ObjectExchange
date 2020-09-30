package Server;
import org. json.simple.JSONObject;
import java.io.File;

public class Transfer
{
  private File JsonFile;
  private static Transfer instance;

  public Transfer(File jsonFile)
  {
    JsonFile = new File("TransferFile.json");
  }

  public void writeToJson(String txt) {

  }
}
