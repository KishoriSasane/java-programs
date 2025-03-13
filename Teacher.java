package AceessSpecifier;

public class Teacher 
{
    public static void add()
    {
      System.out.println("Accessible from anywhere");	
    }
    private static void sub()
    {
    	System.out.println("Cannot be accessed");
    }
    protected static void mul()
    {
    	System.out.println("Can be accessed");
    }
     static void div()
    {
    	System.out.println("Accessible within the same package");
    }
}

