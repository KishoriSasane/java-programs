package basicpgm;

public class GlobalVariable 
{
    static int a=100;
    static int b=400;
    static void addition()
    {
    	System.out.println(a+b);
    }
    static void subtraction()
    {
    	System.out.println(a-b);
    }
    static void multiplication()
    {
    	System.out.println(a*b);
    }
    public static void main(String[] args) 
    {
		addition();
		subtraction();
		multiplication();
	}
}
