package linkedHashMap;
import java.util.*;
public class linkedHashmap {
    
    public static void main(String args[])
    {
          LinkedHashMap<Integer,String> obj= new LinkedHashMap<>();
          obj.put(1, "Narsingh");
          obj.put(2,"Hemant");
          obj.put(3,"Keshav");
          System.out.println(obj);
          System.out.println(obj.size());
          System.out.println(obj.get(1));

    }
}
