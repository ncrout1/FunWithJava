package ArrayList;
import java.util.*;
public class getitemsarraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> arrayObj= new ArrayList<>();
        arrayObj.add(10);
        arrayObj.add(230);
        arrayObj.add(450);
        for (int i:arrayObj)
        {
            System.out.println(i);
        }
        System.out.println(arrayObj.size());

    }

}
