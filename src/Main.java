import Model.Cat.Cat;
import Util.JSONSerilizer;
import Util.ObjectSerilizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main
{
  public static void main(String[] args)
  {
    Cat cat = new Cat("Bob", "Bobcat", 9, 1, 10000, "black", false);

    try
    {
      ObjectSerilizer<Cat> serilizer= new JSONSerilizer();
    System.out.println(serilizer.serilizer(cat));

      BufferedReader bufferedReader = new BufferedReader(new FileReader("csharp/SDJ3DistributedObjectsTransfer/SDJ3DistributedObjectsTransfer/cat.json", StandardCharsets.UTF_8));

      StringBuilder spn = new StringBuilder();

      String line;
      while ((line = bufferedReader.readLine()) != null)
      {
        spn.append(line);
      }

    Cat cat1 = serilizer.deserilizer(spn.toString());
      System.out.println(cat1.toString());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }
}
