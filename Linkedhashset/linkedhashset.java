package Linkedhashset;
import java.util.*;
public class linkedhashset {
    public static void main(String args[])
    {
        LinkedHashSet <Integer>obj =new LinkedHashSet<>();
        obj.add(12);
        obj.add(34);
        obj.add(654365);
        for (int i : obj)
        {
            System.out.println(i);
        }
        System.out.println(obj.size());
        // System.out.println(obj.get(1));
    }

    
}
