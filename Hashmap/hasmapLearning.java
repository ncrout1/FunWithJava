package Hashmap;
import java.util.*;
public class hasmapLearning {
    public static void main(String args[])
    { 
        HashMap<Integer,String> obj= new HashMap<>();
        obj.put(1,"Narsingh");
        obj.put(2,"Hemant");
        obj.put(3,"Keshav");
        System.out.println(obj); 
        System.out.println(obj.get(1));
        if(obj.containsKey(1))
        {
            System.out.println("Hey bhai");
        }

    }
    
}
