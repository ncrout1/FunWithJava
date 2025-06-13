package StringQuestion;
import java.util.*;
public class numberOfwords {
    public static void main(String args[])
    {   int count=0;
        String input;
        Scanner scannerObj= new Scanner(System.in);
        input=scannerObj.nextLine();
        //To find number of words
        for (int i=0;i<input.length();i++)
        {  if(input.charAt(i) == ' ')
           {
            count++;
           }

        }
        count=count+1;
        System.out.println("Number of count "+count);
    }
    
}
