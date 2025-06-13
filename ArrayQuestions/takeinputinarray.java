package ArrayQuestions;

import java.util.*;

public class takeinputinarray {
    public static void main(String args[])
    {
        String [] array,str;
        int a;
        System.out.println("Please enter the array size:");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        array = new String[a];
        for(int i=0;i<a;i++)
        {   
            array[i]=obj.next();
        }
        for (String p: array)
        {
            System.out.println(p);
        }
        Arrays.reverse(array);
    }
}
