package vectorList;
import java.util.*;
public class vectorlist {
    public static void main(String args[])
    {
        Vector <Integer> obj= new Vector<>();
        obj.add(12);
        obj.add(2);
        obj.add(56);
        for (int i : obj)
        {
            System.out.println(i);
        } 
        System.out.println(obj.size());
    }
    
}
