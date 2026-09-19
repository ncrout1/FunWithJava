/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		int [] arr ={1,2,3,4,5};
		int largest=0;
		int secondlargest=0;
		for (int i: arr)
		{
		    System.out.println(i);
		}
		
		for (int i:arr)
		{
		    if (i>largest )
		    {
		        secondlargest=largest;
		        largest=i;
		    }
		    else if(i>secondlargest && i!=largest) {
		        secondlargest=largest;
		        
		    }
		    
		}
		
		System.out.println(largest);
		System.out.println(secondlargest);
	}
}
