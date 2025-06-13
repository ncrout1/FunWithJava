package Inheritance;
class baseClaas{
    int a;
    void name()
    {
        System.out.println("My name is narsingh");
    }
    void age()
    {
        System.out.println("hello");
    }
}

public class inheritance extends baseClaas{
    @Override
    void name()
    {
        System.out.println("My name is Hemant");

    }
    public static void main(String args[])
    {
        inheritance obj= new inheritance();
        obj.name();
        obj.age();
    }
  
    
}
