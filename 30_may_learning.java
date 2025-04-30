// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class sachin{
    
    void print()
    {
        System.out.println("This is the main class");
    }
}
class rohit extends sachin{
    @Override
    void print()
    {  super.print();
        System.out.println("This function is overrided");
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        rohit obj1 =new rohit();
        obj1.print();
    }
}
