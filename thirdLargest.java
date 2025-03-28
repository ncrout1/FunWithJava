// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int largest,secondLargest,thirdLargest;
        largest=secondLargest=thirdLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {   thirdLargest=secondLargest;
                secondLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!=largest)
            {    thirdLargest=secondLargest;
                secondLargest=arr[i];
                
            }
            else if (arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=thirdLargest)
            { thirdLargest=arr[i];
                
            }
        }
        System.out.println(secondLargest);
        
    }
}
