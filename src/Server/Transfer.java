package Server;
import Model.Coffeepot;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Transfer
{
  private File JsonFile;
  private static Transfer transfer;
  public Transfer()
  {
    JsonFile = new File("TransferFile.json");
  }

  public void writeToJson(Coffeepot coffeepot) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String jsonString = gson.toJson(coffeepot);
    System.out.println(jsonString);
    try {
      FileWriter jsonWriter = new FileWriter(JsonFile);
      jsonWriter.write(jsonString);
      jsonWriter.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Transfer getInstance() {
    if (transfer == null) {
      transfer = new Transfer();
    }
    return transfer;
  }

}