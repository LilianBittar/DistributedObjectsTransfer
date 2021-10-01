package Util;

import Model.Cat.Cat;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONSerilizer implements ObjectSerilizer<Cat> {
    private final Gson gson;
    private final FileWriter fileWriter;


    public JSONSerilizer() throws IOException {
        gson = new Gson();
        fileWriter = new FileWriter("cat.json");
    }
    @Override
    public String serilizer(Cat cat)  {
            String catAsJson = gson.toJson(cat);
        try {
            fileWriter.write(catAsJson);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return catAsJson;
    }

    @Override
    public Cat deserilizer(String cat) {
        return gson.fromJson(cat,Cat.class);
    }
}
