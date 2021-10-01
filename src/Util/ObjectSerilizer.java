package Util;

import Model.Cat.Cat;

import java.io.IOException;

public interface ObjectSerilizer<T> {
    public String serilizer (T t) throws IOException;
    public Cat deserilizer (String t);
}
