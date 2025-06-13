package StringQuestion;

import java.util.Scanner;

/**
 * checkfirstletter
 */
public class checkfirstletter {
    
    public static void main(String args[])
    {

        // variable section
    String givenString;
    boolean val;
    char ch;
     //input string from user
    System.out.println("Please give your input here");
    Scanner sc= new Scanner(System.in);
    givenString= sc.nextLine();
    ch=givenString.charAt(0);
    System.out.println("Substring of given input");

    if(Character.isUpperCase(ch))
    {System.out.println("Character is in upper case"+givenString.toUpperCase());

    }
    else{

   System.out.println("character was in small letter"+givenString.toLowerCase().replace('N','A'));
    }
    // if(isUpper(givenString[0]))
    System.out.println(givenString);
    // for(int i=0;i<givenString.length();i++)
    // {
    //     System.out.println(givenString.charAt(i));
    // }

    }

    // if()
}