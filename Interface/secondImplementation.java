/**
 * InnersecondImplementation
 */
interface ram {
    void printName();
    void printAge();


    
}
public class secondImplementation implements ram{
    @Override
    public void printName()
    {
        System.out.println("Your name is ");
    }
    @Override
    public void printAge()
    {
        System.out.println("Your age");

    }
    public static void main(String args[])
    {
        secondImplementation obj= new secondImplementation();
        obj.printAge();
        obj.printName();
    }
}
