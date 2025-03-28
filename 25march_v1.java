// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Narsingh is working on java project
class narsingh{
    boolean checkPresence(int [] a, int [] b)
    {
        int firstSize=a.length;
        int secondSize=b.length;
        boolean checkPresence;
        
        for (int i=0; i<secondSize;i++)
        {    checkPresence=false;
            for (int j=0;j<firstSize;j++)
            {
                if (b[i]==a[j])
                {
                    checkPresence=true;
                    break;
                }
            }
            if (!checkPresence)
            return false;
            
        }
        return true;
    }
    
    
    public static void main(String [] args)
    {
        
        int [] a={1,2,3,4};
        int [] b={6,7};
         
         narsingh obj = new narsingh();
         obj.checkPresence(a,b);
         System.out.print(obj.checkPresence(a,b));
        
        
    }
    
}
