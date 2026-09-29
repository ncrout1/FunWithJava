// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //System.out.println("Try clicking the Run button.");
        Scanner narsingh = new Scanner(System.in);
        //int var= narsingh.nextInt();
        String value = narsingh.nextLine();
        System.out.println(value);
        //System.out.println(var);
       StringBuilder go=new StringBuilder();
        StringBuilder wait=new StringBuilder();
        String reversedValue=new StringBuilder(value).reverse().toString();
        for (char i : reversedValue.toCharArray())
            {
                  
                if (i!=' ')
                {
                    go.append(i);
                    
                }
              else{
                    go.reverse();
                    wait.append(go);
                   wait.append(i);
                    go.setLength(0);
                }
                
                
            }
            go.reverse();
        wait.append(go);
        //System.out.println(go);
        System.out.println(wait);

        

         
            }
}
