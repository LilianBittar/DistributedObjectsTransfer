import Model.Cat.Cat;
import Util.JSONSerilizer;
import Util.ObjectSerilizer;

import java.io.IOException;

public class Main
{
  public static void main(String[] args)
  {
    Cat cat = new Cat("Bob", "Bobcat", 9, 1, 10000, "black", false);

    try
    {
      ObjectSerilizer<Cat> serilizer= new JSONSerilizer();
    System.out.println(serilizer.serilizer(cat));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }
}
