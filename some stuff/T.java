interface MyInterface
{
}
public class T implements MyInterface
{
    static String s;
    public static void main(String args[])
    {
        T t = new T();
        if(t instanceof MyInterface)
        {
            System.out.println("I am true interface");
        }
        else 
        {
            System.out.println("I am false interface");
        }
        if(s instanceof String)
        {
            System.out.println("I am true String");
        }
        else 
        {
            System.out.println("I am false String");
        }
    }    
}