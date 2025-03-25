class narsingh{
    int checkPresence(int [] a, int [] b)
    {
        int firstSize=a.length;
        int secondSize=b.length;
        return firstSize+secondSize;
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
